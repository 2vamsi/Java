package methodOverRiding34;

public class Example10 {

	
	public void test1() {
		
		System.out.println("from Example10 test1()");
	}
	
	public void test2() {
		
		System.out.println("from Example10 test2()");
	}
	
	public static void main(String[] args) {
		
		Example9 obj = new Example9();
		obj.test1();
		obj.test2();
	}
}

