package n_abstractClass36;


/* · Abstract class will have implemented and unimplemented methods.
 ( where as interface can have only unimplemented methods
 
 	keyword - abstract
 
· Here also, We Cannot create object of Abstract class, because all methods are not implemented.


· But, We Can write constructor in Abstract class. ( we can not write a constructor in case of interface)


· To make class Abstract class we need to have at least one method as Abstract method. 
 ( because - without abstract method, there is no point in writing abstract class)


· We can create Reference of Abstract class and object of child class.


To create abstract class :  While creating a class, after entering the class name select abstract checkbox 
 
*/

public abstract class A {

	// test1() doesn't have any implementation 
	public abstract void test1();
	
	// test2() has the  implementation 
	public void test2() {
		System.out.println("I am implemented method test2() from abstract class A");
	}
	
	public void test3() {
		System.out.println("I am implemented method test3() from abstract class A");
	}
	
	public abstract void test4();

	// not written private below, it is default access type
	abstract void test5();
}
 