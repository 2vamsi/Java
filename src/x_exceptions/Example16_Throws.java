package x_exceptions;

import java.io.IOException;

/*
 * here,in method(), we have declared throws IO exception, however
 * we didn't throw/ create any exception inside the body, which is fine  in Java. 
 * 
 * We do like this, when we have 100 lines of code and we are not sure
 * which line will throw the exception. However, we some other method calls this method 
 *  that method must still handle the exception 
 *  
 *  i.e. Example15_Throws must handle the exception for calling this method
 */

public class Example16_Throws {

	void test() throws IOException   {
			throw new IOException("device operation performed");
			
	}

}
