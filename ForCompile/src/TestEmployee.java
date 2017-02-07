import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * javabean表示一行数据
 */
public class TestEmployee {
	
	public static void main(String args[])throws Exception{
		Employee e=new Employee(0301,"高崎",3000,"项目部","2007-10");
		Employee e2=new Employee(0302,"马士兵",3500,"教学部","2006-10");
		
		List<Employee> list=new ArrayList<Employee>();
	
		list.add(e);
		list.add(e2);
		
		printName(list);
	}
	
	public static void printName(List<Employee> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName());
		}
	}
}
