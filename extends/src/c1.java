
abstract public class c1 {
	int a;
	private int b;
	abstract void abs(); 
	abstract void tra();
	void print(){
		System.out.println("c1");
	}
	public c1(int a,int b){
		this.a=a;
		this.b=b;
	}
	public c1(int a){
		this(a,5);
	}
	public static void main(String args[]){

		
	}
	public void show(){
		System.out.println("c1 method");
	}
}
