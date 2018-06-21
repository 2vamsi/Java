package staticAndNonstatic21;

public class Example2 {

	int i;
	static int j;
	
	
	public static void test1() {
		
		//int a =i; error - we can not use non-static member inside a static method
		j=10;
		
	}
	
	
	
	public void test2() {
		
		int a =i; // no error, we can use non static variable inside a non static method
		i=20;
	}
	
	
}
