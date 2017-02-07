import java.util.HashSet;
import java.util.Set;


public class TestSet {
	public static void main(String args[]){
		Set set=new HashSet();
		set.add("wang");
		set.add("jason");
		if(set.add("liu"))
			System.out.println(set.toString());
	}
}
