package thisInJava2728;

/**
 * 
 * 
 * this is also used to invoke current class constructor in below example
 *
 */
public class Example2 {

	Example2(){
		
		System.out.println("Constructor call with default");
	}
	
	Example2(int i) {
		this(7,8);
		System.out.println("Constructor call with 1 parameter");
	}
	
	Example2(int i, int j) {
		this();
		System.out.println("Constructor call with 2 parameter");
	}
	
	public static void main(String[] args) {
		
		Example2 obj = new Example2(4);
	}
}
