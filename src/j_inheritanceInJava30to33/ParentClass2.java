package j_inheritanceInJava30to33;

/**
 * 
 * 
 * how access types work in case of inheritance is shown below 
 *
 */
public class ParentClass2 {
	
	
	public int k=80;
	private int l= 60;
	protected int p=70;
	int i=90;
	
	final int r=50;
	

	public void test1() {

		System.out.println("I am from ParentClass2 - test1()");
	}

	private void test4() {

		System.out.println("I am from ParentClass2 - test4()");
	}
	
	
	protected void test2() {

		System.out.println("I am from ParentClass2 - test2()");
	}

	// when we do not write anything it means it is default
	void test3() {

		System.out.println("I am from ParentClass2 - test3()");
	}

	
	final public void test5() {

		System.out.println("I am from ParentClass2 - final method test5()");
	}
}
