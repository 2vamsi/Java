package o_iib38;

/*Rule2: The instance initializer block is invoked after the parent class constructor
is invoked (i.e. after super() constructor call).

This is explained through Example5 and Example6 
*/

public class Example5 {

	Example5() {
		
		System.out.println("Parent class constructor");
	}
	
	{
		System.out.println("Super IIB");
		
	}
	
}
