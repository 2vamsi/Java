package c_classObject20;


/*Class: - When we say class it represents generic term through which we can indicate
the group of objects. It is also called blueprint of an Object.
Ex. Animal

Object: - Object will have properties and behaviors
Ex. Dog

Method: - Behavior or Action of object is called Method
Ex. Barks / Eats.

*/

public class Example1 {

	// class variable
	int i = 90;

	// below is called concrete method
	public void test() {
		System.out.println("I am test method");
	}

	
	// below is called concrete method
	public void test1(int a) {
		System.out.println("I am test1 method :" + a);
	}

	// below is called main method
	// main method has to be always public, static & void
	// main method will always take argument of array string
	public static void main(String[] args) {

		// creating an object of a class
		Example1 obj = new Example1();
		

		// calling method of the class using object
		obj.test();  // I am test method
		obj.test1(20); // 		I am test1 method :20
		
		System.out.println(obj.i); // 90
	}
}
