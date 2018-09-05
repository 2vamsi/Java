package x_exceptions;

import java.io.IOException;

/*
 * here,  exception will occur, as the called method, i.e. test() is 
 * triggering an exception, 
 * 
 * so print statement for 'normal flow' will not  be executed
 * 
 * you can add try catch block to obj.test() if you want to get Normal flow print line
 * to be executed
 */

public class Example16_Throws_testing {
		public static void main(String[] args) throws IOException  {
			Example16_Throws obj = new Example16_Throws();
			obj.test();
			
			System.out.println("Normal flow... ");
		}
}
