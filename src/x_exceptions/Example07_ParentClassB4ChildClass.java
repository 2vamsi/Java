package x_exceptions;
/*
 * 
 * We can not write superclass exception before the sub-class exception(s)
 * we will get a compile time error , because Superclass will catch any and every exception and so 
 * subclasses will never get executed , so this is not allowed in Java
 * 
 */
public class Example07_ParentClassB4ChildClass {

	public static void main(String[] args) {
		try {
			int a = 9/1;
			int[] array = new int[3];
			System.out.println(array[2]);
			String s1 = null;
			s1.toCharArray();
			
			System.out.println("Hello World");
		} 
		
		catch (Exception e) {
			System.out.println("Exception - is getting called");
			e.printStackTrace();
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
