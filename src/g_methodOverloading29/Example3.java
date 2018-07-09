package g_methodOverloading29;

public class Example3 {

/**
 * 
 *
 * Q: Is it possible to overload method just by changing return type? Answer:
 * -No, since compiler will not understand which method should be called during
 * rum time
 * 
 * so, below type of overloading is not allowed
 */
	
	public void test1(int i) {
		System.out.println("Method with one Argument");
	}

	
	 public int test1(int i) { 
		 System.out.println("Method with one Argument");
		 }
	 

	public static void main(String[] args) {

		Example3 obj = new Example3();

		obj.test1(2);
		obj.test1(4);

	}
}
