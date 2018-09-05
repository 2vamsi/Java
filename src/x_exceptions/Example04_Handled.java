package x_exceptions;

public class Example04_Handled {

	public static void main(String[] args) {
		String s1 = null;
		try {
			s1.toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// action performed on null will trigger null pointer exception
		
		System.out.println("Test running even after the exception1");
		System.out.println("Test running even after the exception2");
		// above lines will be printed, as the exception is handled
	}
}
