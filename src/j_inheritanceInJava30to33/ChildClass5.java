package j_inheritanceInJava30to33;


/**
 * 
 * 
 * Can we create the reference of Parent class and object of child class? 
 * (of-course when we use inheritance)
 * Ans : Yes. But, when we create the reference of Parent class, we can call 
 * the method from parent class. When we create the reference from Child class, we can 
 * call the members of both parent class as well as child class.
 * 
 * 
 * 
 * why because , at the compile time method call happens 
 * for the class which has reference
 * 
 * in below example, using obj we can call only test1 not test2
 * 
 * 
 * so, always try to create the object of the child class, if you
 * have method present in the child class
 * 
 * when we create reference of child class (obj1 in below example), both ( parent class and child class) 
 * members will be available 
 * 
 */
public class ChildClass5 extends ParentClass4{

	
	void test2() {
		System.out.println("I am from ChildClass5");
		
	}
	
	public static void main(String[] args) {
		
		ParentClass4 obj = new ChildClass5();
		obj.test1();
		
		
		ChildClass5 obj1 = new ChildClass5();
		
		obj1.test1();
		obj1.test2();
	}
	
}

