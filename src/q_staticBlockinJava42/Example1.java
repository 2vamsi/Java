package q_staticBlockinJava42;


/*

# Static block is used to initialize the static variables.

# Static block will get executed the moment class is loaded into the memory
 and so will not depend on the object creation

*/
public class Example1 {

	
	static int num;
	static String mystr;
	
	static {
		
		num = 97;
		mystr = "Static keyword in Java";
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Value of num: "+num);
		System.out.println("Value of String: "+mystr);
	}
}
