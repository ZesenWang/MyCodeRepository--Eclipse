import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.Gson;


public class Json {
	public static void main(String []args){

		Gson gson = new Gson();		
		Person p = new Person("jason","hangzhou",20,2014);
		
		Collection c = new ArrayList();
		c.add("wang");
		c.add("tired");
		c.add(p);
		
		String json = gson.toJson(c);
		ArrayList d = gson.fromJson(json, ArrayList.class);
		
		for(int i=0;i<d.size();i++){
			System.out.println(d.get(i).toString());
		}
	}
}
class ShortPerson{
	
	String name;
	String address;
	int age;
	int id;
	
	public ShortPerson(String name, String address, int age,int id) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "ShortPerson [name=" + name + ", address=" + address + ", age="
				+ age + ", id=" + id + "]";
	}
	
	
}
class Person{
	String name;
	String address;
	int age;
	//Person p;
	Student stu;
	public Person(String name, String address, int age,int id) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		stu = new Student(id);
		//p = new Person(name,address,age);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age
				+ ", stu=" + stu + "]";
	}
	
}
class Student{
	int id;
	public Student(int id){
		this.id = id;
	}
}