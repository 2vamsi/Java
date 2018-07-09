package c_constructorInJava2223;

/**
 * 
 * 
 * Apart from Object creation, we can also utilize the constructor to initialize
 * the global variables
 *
 */

public class Example2 {

	int i = 1;
	int j = 1;

	public Example2(int i, int j) {
		// this.i = i;
		// this.j = j;

		this.i = i; // comment this and try to run
		this.j = j;// comment this and try to run
	}

	public static void main(String[] args) {

		Example2 obj = new Example2(2, 8);
		System.out.println(obj.i);
		System.out.println(obj.j);

		Example2 obj1 = new Example2(20, 8);
		System.out.println(obj1.i);
		System.out.println(obj1.j);

	}

}
