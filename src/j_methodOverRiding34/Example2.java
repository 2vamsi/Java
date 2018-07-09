package j_methodOverRiding34;

public class Example2 extends Example1 {

	public void test() {
		System.out.println("From ChildClass test()");
	}
	
	public int test1() {
		
		System.out.println("From ChildClass test1()");
		return 3;
	}
	
	public static void main(String[] args) {
		Example1  obj  = new Example2();
		obj.test();
		obj.test1();
	}
}