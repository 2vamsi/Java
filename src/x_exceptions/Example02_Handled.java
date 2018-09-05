package x_exceptions;

/*
 *   In Try block  if any exception comes, it goes to the catch block ****
 *   Catch will have always an argument of type exception.
 *   
 */
public class Example02_Handled {

	public static void main(String[] args) {
		// Example of handled exception
		try {
			int i =9/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Test running even after the exception");
		// above line will be printed
	}
}
