package i_methodOverloading29;

/**
 * 
 * 
 * Example for method overloading by changing the data type of parameters
 *
 *  
 */
public class Example4 {
	// method overloading by changing the data type of parameters
	public void test1(int i, double d) {
		System.out.println("Method with int and double");
	}

	public void test1(int i, int j) {

		System.out.println("Method with int and int");
	}

	public void test1(int i, int j, boolean k) {

		System.out.println("Method with int, int and boolean");
	}

	public static void main(String[] args) {

		Example4 obj = new Example4();

		obj.test1(2, 2.3);
		obj.test1(4, 2);
		obj.test1(4, 5, true);

	}
}
