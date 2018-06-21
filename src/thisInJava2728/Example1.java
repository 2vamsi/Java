package thisInJava2728;


/**
 * 
 * 
 * this keyword in java, it works as a reference to the current object
 * 
 * this is used to differentiate between global and local variables this is used
 * for method argument, method call
 *
 *
 * Use of This Keyword :
 * • It can be used to refer current class instance variable. 
 * • this () can be used to invoke current class constructor. 
 * • It can be used to invoke current class method (implicitly) 
 * • It can be passed as an argument in the method call. 
 * • It can be passed as argument in the constructor call. 
 * • It can also be used to return the current class instance.
 * • It is available only for non-static.
 */
public class Example1 {

	int i;
	int j;

	public void test(Example1 obj) {

		System.out.println("test(Example1 obj) - is getting calledf");
	}

	public void test3(int obj) {

		System.out.println("test3(int obj - is getting called )");
	}

	public Example1 test4() {

		return this;
	}

	public static void main(String[] args) {

		Example1 obj = new Example1();
		
		obj.test3(5);
		System.out.println("-------");
		System.out.println(obj.test4());
	}
}
