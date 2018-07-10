package n_abstractClass36;

public class B extends A {

	@Override
	public void test1() {
		System.out.println("I am from child class implementation from  test1() ");
	}

	@Override
	public void test4() {
		System.out.println("I am from child class implementation from  test4()");
		 
	}

	@Override
	void test5() {
		System.out.println("I am from child class implementation from  test5()");
		
	}

	//private abstract void test6(); // private can not be accessed by other classes
	
	
	public static void main(String[] args) {
		
		// We can create Reference of Abstract class and object of child class.
		A obj = new B();
		
	// 	A Obj1 = new A(); compile time error
		obj.test1();
		
		obj.test2();
		
		obj.test3();
		
		obj.test4();
		
		obj.test5();
		
	}
}
