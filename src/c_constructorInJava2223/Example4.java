package c_constructorInJava2223;

/**
 * 
 * 
 * How the constructor call happens in the run time? Ans: based on the arguments.
 * i.e. based on the arguments during the run time,particular constructor will
 * be called
 *
 */
public class Example4 {

	Example4() {
		System.out.println("I am Example4()");

	}

	Example4(int i, int j) {
		System.out.println("I am Example4(int i, int j )");

	}

	Example4(int i, int j, int k) {
		System.out.println("I am Example4(int i, int j, int k )");

	}

	public static void main(String[] args) {

		Example4 obj = new Example4();

		Example4 obj1 = new Example4(2, 3);

		Example4 obj2 = new Example4(4, 5, 6);

	}

}
