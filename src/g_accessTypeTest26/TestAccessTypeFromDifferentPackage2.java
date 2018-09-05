package g_accessTypeTest26;

import g_accessType26.AccessType;

/**
 * 
 * when we try to access class members from different package & class through
 * inheritance , we can access only public & protected members
 * 
 * we can not access private and default members
 *
 */
public class TestAccessTypeFromDifferentPackage2 extends AccessType {
 
	public static void main(String[] args) {
		
		TestAccessTypeFromDifferentPackage2 obj = new TestAccessTypeFromDifferentPackage2();
		obj.test1();
		obj.test3();
		// obj.test2(); compile time error
		// obj.test4(); compile time error
	}
}
