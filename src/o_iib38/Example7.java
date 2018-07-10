package o_iib38;

/*
Rule: 3 : The instance initializer block comes in the order in which they appear.
*/

public class Example7 {

	{
		System.out.println("I am first IIB");

	}

	{
		System.out.println("I am second IIB");

	}

	{
		System.out.println("I am third IIB");

	}

	public static void main(String[] args) {

		Example7 obj = new Example7();
	}
}
