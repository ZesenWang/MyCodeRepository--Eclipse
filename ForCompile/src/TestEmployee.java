import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * javabean��ʾһ������
 */
public class TestEmployee {
	
	public static void main(String args[])throws Exception{
		Employee e=new Employee(0301,"����",3000,"��Ŀ��","2007-10");
		Employee e2=new Employee(0302,"��ʿ��",3500,"��ѧ��","2006-10");
		
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
