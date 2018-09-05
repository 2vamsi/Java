package x_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Java Finally blocked will always get executed whether we have handled the 
 * exception or not.
 * 
 * In below example, we are not handling ArithmeticException in catch block, 
 * still finally block will get executed.
 * 
 * 	Finally blocked is used to execute important code like closing 
 * DB connection, closing file connection etc.
 * 
 * IMP Interview Question: In general, return should be the last line of the method
 * anything written after return statement, we will get a compile time error.
 * 
 * But, even when we have return, finally will be executed. Check it.
 * 
 * Note: When we write finally, we can skip the catch block.
 * But, when finally block is not there, catch block is must. Try it and see. 
 */

public class Example18_Finally {

	public static void main(String[] args) {

		try {
			int i = 9/0;
			//return; 
			//System.out.println("Hello");
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally { 
			System.out.println("I am Finally ");
		}
	}
}
