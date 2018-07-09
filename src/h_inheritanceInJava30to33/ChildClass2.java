package h_inheritanceInJava30to33;

public class ChildClass2 extends ParentClass2 {


/**
 * 
 * it is not possible to inherit private members ( variables as well as methods )
 * 
 * we can inherit the final members
 */
	public static void main(String[] args) {

		ChildClass2 obj = new ChildClass2();
		
		
		obj.test1();
		obj.test2(); 
		obj.test3();
	//  obj.test4(); we can not access test4() as it is a private method
		
		obj.test5(); // we are able to call final member
		
		System.out.println(obj.i);
		System.out.println(obj.k);
		System.out.println(obj.p);
		
		System.out.println(obj.r);
	
		
	} 
}
