package h_inheritanceInJava30to33;

/**
 * 
 * when we do not use extends keywords, we would not use test1 and test2 methods from parentclass1
 *
 */
public class ChildClass1 extends ParentClass1 {

	public void test3() {

		System.out.println("I am from ChildClass1 - test3()");

	}

	public static void main(String[] args) {

		ChildClass1 obj = new ChildClass1();
		
		obj.test3();
		
		obj.test1();
		obj.test2(); 
	}
}
