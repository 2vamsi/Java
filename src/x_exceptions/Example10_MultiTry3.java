package x_exceptions;
/*
 * When exception is not handled in inner catch block, they will go to the outer
 * catch block
 * 
 * other try blocks ( nested) will be skipped in this case
 * 
 */
public class Example10_MultiTry3 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Going to divide");
				String s1= null;
				s1.toLowerCase(); // as null pointer exception is not handled by its corresponding catch block here, 
				// it will go for outer catch block
				int a = 9/0;
			} catch (ArithmeticException e) {
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
			System.out.println("Exception handled by sueper class");
		}
		
		System.out.println("normal flow");
	}
}
