package accessType26;

/**
 * 
 * We can not access Private members outside the class
 *
 */
public class TestAccessType {

	
	public static void main(String[] args) {
		AccessType obj = new AccessType();
		
		
		obj.test1();
	//	obj.test2();
		obj.test3();
		obj.test4();
		
		System.out.println(obj.i);
		//System.out.println(obj.j); compile time error
		System.out.println(obj.k);
		System.out.println(obj.d);
	}
}