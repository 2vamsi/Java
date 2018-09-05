package x_exceptions;
/*
 * When exception is  handled in inner catch block, it will go to the outer
 * catch block
 * 
 * & other try blocks ( nested) will be skipped in this case
 * 
 */
public class Example09_MultiTry2 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Going to divide");
				String s1= null;
				s1.toLowerCase(); 
				int a = 9/0;
			} catch (ArithmeticException e) {
				System.out.println(e); 
			}
			
			catch (Exception e) {
				System.out.println(e); 
			}
			
			// below nested try block will be skipped in this case
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
			e.printStackTrace();
			System.out.println("Exception handled by super class");
		}
		
		System.out.println("normal flow");
	}
}
