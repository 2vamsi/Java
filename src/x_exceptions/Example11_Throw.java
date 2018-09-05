package x_exceptions;

/*
 * If we want throw an exception based on certain conditions, we can use
 *  throw keyword. ( this is for our convenience, we use)
 * This will help us to throw exception during run time.
 * 
 * Below example shows how to throw an exception using thorw keyword
 */
public class Example11_Throw {

	public static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Person is not eligible for Voting");
			// throw is the keyword here
			// new operator is used as we are making the object of exception class
			//ArithmeticException is a class and we are making the object of the class 
			// and this object is an argumented object which takes the string type of parameter
		} else {
			System.out.println("Person is eligible for voting");
		}
		System.out.println("shall we allow? ");
	}

	public static void main(String[] args) {
		Example11_Throw obj = new Example11_Throw();
		obj.validateAge(17);
		

	}
}
