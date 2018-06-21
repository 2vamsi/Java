package methodOverRiding34;

public class B extends A {


		private void test() {
			System.out.println("I am from B test()");
		}
		
		static void test1() {
			System.out.println("I am from B test1()");
		}
		
	/*	final void test3() {
			System.out.println("I am from A test1()");
		}
		*/
		
		// final method can not participate in method overrriding 
	public static void main(String[] args) {
		
		B obj = new B();
		obj.test();
		obj.test1();
		
		A obj1 = new B();
		obj1.test1();
		
		// private methods will not participate in method overriding 
	}	
	}
	
