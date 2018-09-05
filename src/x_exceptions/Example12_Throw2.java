package x_exceptions;

/*
 * Below example shows how to handle the exception thrown by  -  thorw keyword
 */

public class Example12_Throw2 {

	public static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Person is not eligible for Voting");
		} else {
			System.out.println("Person is eligible for voting");
		}
	}

	//since we know that we get exception from above code, we will also handle it 
	// using try catch block
	
	public void callValidateAge(int age) {
		
		try {
			validateAge	(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("shall we allow? ");
	}
	
	
	
	public static void main(String[] args) {
		Example12_Throw2 obj = new Example12_Throw2();
		obj.callValidateAge(17);

	}
}
