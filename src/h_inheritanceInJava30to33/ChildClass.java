package h_inheritanceInJava30to33;

/**
 * 
 * 
 * Let us say we have class A as parent class and class B as child class
 * 
 * when class B extends class A, class B will get all the properties of class A
 *
 */


/**
 * 
 * 
 * There are some rules here:
 * we can inherit only non-static members, i.e. we can not inherit static members
 *
 */

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		
		obj.test1();
		obj.test2();
		
	}
}
