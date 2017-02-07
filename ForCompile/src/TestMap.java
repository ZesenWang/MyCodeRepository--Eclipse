import java.util.Map;
import java.util.HashMap;
/*
 * TestMap
 * @version 1.0
 * @author jasonwang
 */
public class TestMap {
	public static void main(String args[]){
		Map map=new HashMap();
		map.put(new String("wang"),new Wife("jason") );
		map.put("jackie", "chan");
		Wife w=(Wife)map.get("wang");
		//map.remove("wang");
		//System.out.println(map.containsKey("wang"));
		//System.out.println(map.size());
		map.clear();
		System.out.println(map.isEmpty());
	}
}

class Wife{
	String name;
	public Wife(String name){
		this.name=name;
	}
	public Wife(){
		this("jason");
	}
}
