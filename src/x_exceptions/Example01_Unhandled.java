package x_exceptions;

/*
 * As we know that when exception comes execution of program will terminate. 
 * To avoid that we need to handle the exception.
 * 
 * We can use try catch block to handle the exception.
 

 */
public class Example01_Unhandled {

	public static void main(String[] args) {
		// Example of unhandled exception
		int i =9/0;
		System.out.println("Test running even after the exception");
		// above line will not be printed
	}
}
