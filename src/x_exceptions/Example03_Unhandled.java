package x_exceptions;

public class Example03_Unhandled {

	public static void main(String[] args) {
		String s1 = null;
		s1.toLowerCase();
		// action performed on null will trigger null pointer exception
		
		System.out.println("Test running even after the exception1");
		System.out.println("Test running even after the exception2");
		// above line will not be printed
	}
}
