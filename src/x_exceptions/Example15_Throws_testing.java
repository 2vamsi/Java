package x_exceptions;

import java.io.IOException;

/*
 * here, no exception will occur, as the called method, i.e. method(), doesn't 
 * trigger any exception, 
 * 
 * so print statement for 'normal flow' will also be executed
 */

public class Example15_Throws_testing {
		public static void main(String[] args) throws IOException {
			Example15_Throws obj = new Example15_Throws();
			obj.method();
			System.out.println("Normal flow... ");
		}
}
