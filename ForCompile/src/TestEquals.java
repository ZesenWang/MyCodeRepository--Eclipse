
public class TestEquals {
	public static void main(String args[]){
		Object obj=new Object();
		String str="jason";
		String str2="jason";
		Integer in2=new Integer(25);
		Integer in3=new Integer(25);
		Wif w1=new Wif("angle");
		Wif w2=new Wif("angle");
		if(str=="jason")
			System.out.println(str.hashCode());
		if(str.equals(str2))
			System.out.println("jason".hashCode());
		if(str.equals("jason"))
			System.out.println(str2.hashCode());
	}
}

 class Wif{
	//int age;
	String name;
	public Wif(String name){
		this.name=name;
	}
}