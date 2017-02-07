
public class F2 extends F1{

	public void show(){
		System.out.println("F2");
	}
	public static void main(String args[]){
		F1 f=new F1();
		f.show();
		F3 d=new F3();
		d.present();
	}
}
