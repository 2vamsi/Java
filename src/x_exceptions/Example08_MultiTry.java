package x_exceptions;
/*
 * 

 * It is possible to have multiple try blocks, but each try block must have at least one catch block 
 * 
 * Also it is possible to have nested try blocks. i.e. try block inside another try block ***
 * 
 * if we know the subclass we can write them, otherwise we can write superclass which is Exception 
 * 
 */
public class Example08_MultiTry {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Going to divide");
				int a = 9/0;
			} catch (ArithmeticException e) {
				System.out.println(e); // when we print e, only exception will be printed ** not the stack trace
			}
			
			
			try {
				int a [] = new int[3];
				a[5]=4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			
			String s1 = null;
			s1.toCharArray();
			
			System.out.println("Other Statement");
		} 
		
		catch (Exception e) {
			System.out.println("Exception - is getting called");
			System.out.println(e);
		}
		
		System.out.println("normal flow");
	}
}
