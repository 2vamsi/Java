package x_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;



/*
 * Exception is an event that disrupts the normal flow of the program
 * 
 * The exception handling in java is one of the powerful mechanism to handle
 * the runtime errors, so that normal flow of the application can be maintained.
 * 
 * Checked exceptions we get to know during compile time and compiler will suggest
 * to add throw exception / handle through try catch block
 * 
 * Run-time exceptions we get to know only during runtime ( ex. nullPointer,numberFormat etc) 
 * 
 * 
 */
public class A_TypesOfExceptions extends Test1 {

	
	static String s1;
	
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	public static void arithmeticException() {
		int a =9/0;
		
		/*
		 * run time exception that happens during arithmetic operatiosn like
		 * division with zero 
		 * 
		 */
	}
	
	
	//Exception in thread "main" java.lang.NullPointerException
	public static void nullPointerException() {
		System.out.println(s1.concat("Test"));
		//Note: s1 is not initialized here, which is causing the exception
	}
	
	
	//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	public static void stackOverFlow() {
		ArrayList<Integer> array = new ArrayList<Integer>(); 
		
		while(true) {
			array.add(10);
			//Array list will grow dynamically, but as there is no break here, after some time
			//when size is exceeded, we will get OutOfMemoryError exception 
		}
	}
	
	
	// Exception in thread "main" java.lang.NumberFormatException: For input string: "Test"
	public static void numberFormatException() {
		String s1 = "test";
		int t = Integer.parseInt(s1); // we can not convert string into Integer
		/*
		 * we can convert if the string is like "554"
		 */
		
		//System.out.println(t);
		
		//Double.parseDouble(s1); // we can not convert string into double either
		
		//Short.parseShort(s1); // we can not convert string into short either
		
		// Long.parseLong(s1); // we can not convert string into long either
		
		//Boolean.parseBoolean(s1); // we can not convert string into boolean either
	}
	
	
	//Exception in thread "main" java.io.FileNotFoundException: 
	// C:\test.xls (The system cannot find the file specified)
	
	public static void fileNotFoundException() throws FileNotFoundException   {
		FileReader f = new FileReader("C:/test.xls");
		
		//This is an example of checked exception
	}
	
	
	
	//Exception in thread "main" java.lang.ClassNotFoundException: Test1234
	//Example of checked exception
	public static void classNotFoundException() throws ClassNotFoundException {
		
		Class.forName("Test1234");
	}
	
	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	public static void arrayIndexOutOfBound() {
		int[] a = new int[5];
		System.out.println(a[5]); 
		// here array index exists only from 0 to 4
	}
	
	
	//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	public static void outOfMemoryException() {
		long data[] = new long[100000000];
	}
	
	//Exception in thread "main" java.lang.ClassCastException: x_exceptions.
	//Test1 cannot be cast to x_exceptions.A_TypesOfExceptions
	public static void classCastException() {
		
		Test1 obj = new Test1();
		System.out.println((A_TypesOfExceptions) obj);
		
		// this is how we change one class object to another class object
		// we call this as class casting
		
		/*
		 * Note: In Java,  we can not change parent class object into child class, when we do it, we 
		 * get classCast exception.
		 * 
		 * we can change the child class object to parent class, which is allowed
		 */
	} 
	
	
	//Exception in thread "main" java.lang.NullPointerException
	public static void nullPointerException1() {
		InputStreamReader obj = new InputStreamReader(null);
		// exception as we are pointing null in place of file name
		
		// Note: InputStreamReader is used to read any file at one shot
		
	}
	
	//Exception in thread "main" java.lang.IllegalStateException: Scanner closed
	public static void illegalStateException() {
		
		String s = "Hello World";
		Scanner scanner = new Scanner(s);
		System.out.println(""+ scanner.nextLine());
		scanner.close();
		System.out.println(""+ scanner.nextLine());
		// we get an Illegal State exception as the scanner is closed, but we are trying to access
		// and print the next line. 
	}
	
	//This is checked exception 
	
	public static void interruptedException() throws InterruptedException {
		Thread.sleep(2000);
		/*
		 * as we are interrupting the program execution, with thread.sleep
		 * we get Interrupted exception here, 
		 */
	}
	
	public static void main(String[] args) throws InterruptedException  {
		/* arithmeticException();
		 * nullPointerException();
		 * stackOverFlow();
		 * 	numberFormatException();
		 * fileNotFoundException();
		 * classNotFoundException();
		 * arrayIndexOutOfBound();
		 * outOfMemoryException();
		 * classCastException();
		 * nullPointerException1();
		 * 	illegalStateException();

		*/
	
		interruptedException() ;
	
		
				
	}
	
}
