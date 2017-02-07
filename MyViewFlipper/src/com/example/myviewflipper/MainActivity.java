package com.example.myviewflipper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.GestureDetector.OnGestureListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends Activity implements OnGestureListener{

	private GestureDetector gestureDetector;
	private	ViewFlipper	flipper;
	private	LinearLayout	layout;
	private	Context	context;
	private	int	now	=	0;
	private	int	pictureCounts	=	6;	//因为只有六张图片滑动,所以定义为6
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * 初始化UI和一些属性
     * */
    private	void	init(){
    	gestureDetector=new GestureDetector(this);
    	flipper	=	(ViewFlipper) findViewById(R.id.viewFlipper1);
    	flipper.setDisplayedChild(now);	//	开始先显示第一张
    	layout	=	(LinearLayout) findViewById(R.id.linearLayout);   	
    	generatePageControl();
    }
    
    /**
     * 初始化滑动小白点
     * */
    private void generatePageControl() {
    	layout.removeAllViews();

        for (int i = 0; i < pictureCounts; i++) {
                ImageView imageView = new ImageView(this);
                imageView.setPadding(0, 0, 6, 0);
                if (now  == i) {
                        imageView.setImageResource(R.drawable.page00);//选中的圆点图片下面的反之
                } else {
                        imageView.setImageResource(R.drawable.page01);
                }
                this.layout.addView(imageView);
        }
    }
    
    @Override
	public boolean onTouchEvent(MotionEvent event) {
		return gestureDetector.onTouchEvent(event);
	}

	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		// TODO Auto-generated method stub
		if (e2.getX() - e1.getX() > 120) {			 // 从左向右滑动（左进右出）
			Animation rInAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.push_right_in); 	// 向右滑动左侧进入的渐变效果（alpha  0.1 -> 1.0）
			Animation rOutAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.push_right_out); // 向右滑动右侧滑出的渐变效果（alpha 1.0  -> 0.1）

			flipper.setInAnimation(rInAnim);
			flipper.setOutAnimation(rOutAnim);
			flipper.showPrevious();
			now--;
			if(now	<	0){
				now	=	pictureCounts	-	1;
			}
			generatePageControl();
			return true;
		} else if (e2.getX() - e1.getX() < -120) {		 // 从右向左滑动（右进左出）
			Animation lInAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.push_left_in);		// 向左滑动左侧进入的渐变效果（alpha 0.1  -> 1.0）
			Animation lOutAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.push_left_out); 	// 向左滑动右侧滑出的渐变效果（alpha 1.0  -> 0.1）

			flipper.setInAnimation(lInAnim);
			flipper.setOutAnimation(lOutAnim);
			flipper.showNext();
			now++;
			if(now	>	pictureCounts	-	1){
				now	=	0;
			}
			generatePageControl();
			return true;
		}
		return true;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "你点重美女:"	+	now, Toast.LENGTH_SHORT).show();
		return false;
	}
}
