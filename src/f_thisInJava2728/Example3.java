package f_thisInJava2728;


/**
 * 
 * 
 * this is also used for calling a method
 * 
 * this basically represents the object of the class
 * so using this keyword, we can call the method of the same class
 *
 */
public class Example3 {

	int i;
	int j;

	public void test1() {

		System.out.println("value of this.i: " + this.i);
	}

	// here this is being used for calling the method.
	// since this represents current class object, this is available
	// only for non static members

	public void test2() {

		this.test1();
	}

	public static void main(String[] args) {
		Example3 obj = new Example3();
		obj.test2();

	}
}
