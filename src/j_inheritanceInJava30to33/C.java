package j_inheritanceInJava30to33;

/**
 * 
 * 
 * Java supports multi layer inheritance
 * 
 * here C is child for B
 * 
 *B is child for A 
 *
 *so A is super parent for C
 *
 *C can access the properties of B as well as A
 *
 */


public class C extends B{

	public void test3() {
		
		System.out.println("C");
	
	}
	
	public static void main(String[] args) {
		
		C obj = new C();

			obj.test1();
			obj.test2();
			obj.test3();
		
	}
}
