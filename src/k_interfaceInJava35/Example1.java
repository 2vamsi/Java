package k_interfaceInJava35;

/*
 
 keyword :interface (instead of class)
 
 
• Interface is a kind of class which will have only unimplemented methods
i.e. method has no implementation at all, in case of interface

• Interface members are by default : Public static final

• We call interface as 100 % abstract class.

• Multiple inheritance is possible in case of interface.

• We cannot create object of interface class, since all the members are unimpeded.

• We cannot create constructor of interface. Since object creation for interface


*/

public interface Example1 {

	public static final int i = 80;

	int j = 90; // though we have not written public static final, members of interface are
	// by default public static final

	public void test1();
	
	int test2(); // though we have not written, methods of interface are public
	
	char test3();
	
	int test4();
	
	
	// we will get compile time errors , implemented method is not allowed in case of interface
	/*
	 * int test5() {
	 * 
	 * 
	 * }
	 */

}
