package x_exceptions;

import java.io.IOException;

/*
 * 
 * since we are calling a method which throws  IOException  - 
 * , it will force us to handle the exception
 * 
 * Note: Remove throws Exception in method declaration and see , to test
 */

public class Example13_Throws_testing {

	public static void main(String[] args) throws IOException  {
		Example13_Throws obj = new Example13_Throws();
		obj.validateAge(17);
	}

}
