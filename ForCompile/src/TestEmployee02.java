import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * һ��map��Ӧһ����ṹ
 */

public class TestEmployee02 {
	public static void main(String args[]){
		Map map01=new HashMap();
		map01.put("id", 0301);
		map01.put("name","����" );
		map01.put("salary", 3000);
		map01.put("department", "��Ŀ��");
		map01.put("hiredate", "2007-10");
		
		List<Map> list=new ArrayList<Map>();
		list.add(map01);
		
		printName(list);
	}
	public static void printName(List<Map> list){
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).get("name"));
	}
}
