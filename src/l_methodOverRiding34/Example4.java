package l_methodOverRiding34;

public class Example4  {

	public void test() {
		System.out.println("From ChildClass test()");
	}

	public int test1() {

		System.out.println("From ChildClass test1()");
		return 3;
	}

	public static void main(String[] args) {
		 Example3 obj = new Example3();
		 obj.test();
		 obj.test1();
		 obj.test2();

	
	}
}