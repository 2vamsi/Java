package j_methodOverRiding34;

public class Example8 extends Example7 {

	public void sum() {

		System.out.println("sum() from child class");
	}

	public void test() {

		System.out.println("test() from child class");
	}
	
	
	public static void main(String[] args) {

		// reference of parent and object of child
		
		Example7 obj = new Example8();
		obj.test();

		// reference of child and object of child
		Example8 obj1 = new Example8();
		obj1.test();
		obj1.sum();
		obj1.run();

		
	}
}
