package x_exceptions;
/*
 * 
 * When exception happens in the try block, the remaining code ( code after the line which triggered 
 * the exception) will not be executed, control will directly go to catch block
 * 
 * For One Try block, we can write multiple catch blocks ****
 * 
 * Exception is super class and ArithmeticException, ArrayIndexOutOfBoundsException are sub classes

 * we can use them, so that the control will go into that particular catch block only,
 * depending on the exception happens
 * 
 * 
 */
public class Example05_Handled {

	public static void main(String[] args) {
		String s1 = null;
		try {
			int a = 9/1;
			int[] array = new int[3];
			System.out.println(array[4]);
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
		
		System.out.println("Test running even after the exception1");
		System.out.println("Test running even after the exception2");
		System.out.println("Test running even after the exception3");
	}
}
