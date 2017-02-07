import java.util.Calendar;


public class toString{
	public static void main(String args[]){
		String str="11.2"+"12.3";
		System.out.println(str.toString());
		Integer in=new Integer(250);
		System.out.println(in.toString());
		Double dou=new Double(25.36);
		System.out.println(dou.toString());
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.toString());
	}
}