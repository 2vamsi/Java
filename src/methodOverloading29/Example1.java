package methodOverloading29;


/**
 * 
 * method overloading  is a concept where we can create multiple methods with same name by
 * changing the arguments of the method
 * 
 * this is similar to constructor overloading
 * 
 * method overloading is called compile time polymorphism 
 * 
 *  * 
 * we can perform method overloading in 3 ways:
 * 
 * i.e. by changing  - 
 * 
 * 1. Number of parameters to the method
 * 
 * 2. Data type of parameters
 * 
 * 3. Sequence type of parameters
 *
 *
 *
 * here, method calling will happen based on the arguments passed
 */


/**
 * 
 * Below example shows method overloading by changing the 
 * sequence type of parameters
 */


public class Example1 {

	// method overloading by changing the sequence of parameters
	public void test1(int i, double d) {
		System.out.println("test1(int i, double d)");
	}
	
	public void test1(double i, int d) {
		
		System.out.println("test1(double i, int d)");
	}
	
	public static void main(String[] args) {
		
		Example1 obj = new Example1();
		
		obj.test1(2, 4.5);
		obj.test1(4.5, 2);
		
	}
}


