package methodOverloading29;

/**
 * 
 * example for method overloading by changing the number of parameters
 *
 * 
 */
public class Example2 {

	public void test1(int i) {
		System.out.println("Method with one Argument");
	}
	
	public void test1(int i, int j) {
		
		System.out.println("Method with two Arguments");
	}
	
	
	public void test1(int i, int j, int k) {
		
		System.out.println("Method with three Arguments");
	}
	public static void main(String[] args) {
		
		Example2 obj = new Example2();
		
		obj.test1(2);
		obj.test1(4, 2);
		obj.test1(4, 5, 7);
		
	}
}


