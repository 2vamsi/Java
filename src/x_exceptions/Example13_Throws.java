package x_exceptions;

import java.io.IOException;

/*
 * Throws keyword is used in method declaration, in order to explicitly 
 * specify the exceptions that a particular method might throw. 
 * 
 * When a method declaration has one or more exceptions defined using throws 
 * clause, then the method-call must handle all the defined exceptions.
 */

public class Example13_Throws {

	public static void validateAge(int age) throws IOException {
		if (age < 18) {
			throw new ArithmeticException("Person is not eligible for Voting");
		} else {
			System.out.println("Person is eligible for voting");
		}
	}

	
}
