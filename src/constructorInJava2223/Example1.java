package constructorInJava2223;

/**
 * 
 * very important topic in Java. without constructor we can not do anything in
 * Java
 * 
 * In Java constructor is similar to method, but Constructor cannot have return
 * type.
 * 
 * constructor is used for object creations, without constructor we can not
 * create an object for a class
 * 
 * Constructor is called when we create object of class.
 * 
 * Constructor Name should be same as class Name.
 * 
 * When we don’t create constructor in class, Java compiler will keep by default
 * constructor in class.
 * 
 * 
 * There are 2 types of Constructors a. Default Constructor ( No arg
 * Constructor) b. Parameterized Constructor
 *
 * 
 */
public class Example1 {

	// Default constructor
	public Example1() {

		System.out.println("Example1()");

	}

	// Parameterized constructor
	public Example1(int a) {

		System.out.println("Example1(int a)");

	}

	public static void main(String[] args) {
		// Constructor is called when we create object of class, so print statment gets
		// executed
		Example1 obj = new Example1();

		// reference should not be duplicatead, so we need to write it separately
		Example1 obj1 = new Example1(5);
	}

}
