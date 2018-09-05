package x_exceptions;
/*
 * 

 * Exception class will catch all the exceptions in the program,
 * if we know the subclass we can write them, otherwise we can write superclass which is Exception 
 * 
 */
public class Example06_MultiCatch {

	public static void main(String[] args) {
		try {
			int a = 9/1;
			int[] array = new int[3];
			System.out.println(array[2]);
			String s1 = null;
			s1.toCharArray();
			
			System.out.println("Hello World");
		} 
		
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException - is getting called");
			e.printStackTrace();
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException - is getting called");
			e.printStackTrace();
		}
		
		catch (Exception e) {
			System.out.println("Exception - is getting called");
			e.printStackTrace();
		}
		
		System.out.println("Test running even after the exception1");
		System.out.println("Test running even after the exception2");
		System.out.println("Test running even after the exception3");
	}
}
