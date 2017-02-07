import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class TestIterator {
	public static void main(String args[]){
		Set set=new HashSet();
		set.add("jason");
		set.add("wang");		
		set.add("order");
		set.add("right");
		set.add("handsome");
		
		Iterator iter=set.iterator();
		
		while(iter.hasNext()){
			String str=(String) iter.next();
			System.out.println(str);
		}
		//while(iter.hasNext())
		System.out.println(iter.hasNext());
		
		List list=new ArrayList();
		list.add("I");
		list.add("dont");
		list.add("go");
		list.add("to");
		list.add("English Class");
		
		for(int i=0;i<list.size();i++){
			System.out.println((String)list.get(i));
		}
	}
}
