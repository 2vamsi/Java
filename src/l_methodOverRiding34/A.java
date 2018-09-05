package l_methodOverRiding34;


/**
 * 
 * Method Overriding is the feature of java which allow us to create same method in
parent and child class with same name and with same arguments.

• Method Overriding is the ability of java which will make sure method call will happen
from a class for which we have created the object. Not from referenced class.

• At compile time method call happens from reference class.

• At Run time method call happens from object class.

• Method Overriding is possible only by inheritance.

• Method Overriding, we also call it as run time polymorphism.

• We cannot override private members.
 * @author Vamsi
 *
 */
public class A {

	private void test() {
		System.out.println("I am from A test()");
	}
	
	static void test1() {
		System.out.println("I am from A test1()");
	}
	
	final void test3() {
		System.out.println("I am from A test1()");
	}
}
