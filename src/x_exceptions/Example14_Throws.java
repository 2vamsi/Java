package x_exceptions;

import java.io.IOException;

/*
 * here, test2() must use throws IO exception in method declaration,
 * as it is accessing test1() which has exception ( throw keyword) 
 * 
 * same is the case with test3(), but in test3() exception is handled using
 * try catch block 
 * 
 * in main method, test3() is called, 
 * test3() inturn will call test2()
 * test2() inturn will call test1()  where the exception happens,
 * 
 * however, the exception will be handled in the catch block of test3(), 
 * which is interesting part here
 */

public class Example14_Throws {

	void test1() throws IOException   {
			throw new IOException("Device errorr...!"); // checked exception 
	}

	void test2() throws IOException {
		test1();
	}
	
	void test3() {
		try {
			test2();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception handled...");
		}
	}

	
	public static void main(String[] args) {
		Example14_Throws obj = new Example14_Throws();
		obj.test3();
		System.out.println("normal flow...");
	}
}
