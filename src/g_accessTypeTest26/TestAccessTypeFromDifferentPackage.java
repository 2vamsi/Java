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
public class TestAccessTypeFromDifferentPackage extends AccessType {
 
	public static void main(String[] args) {
		
		TestAccessTypeFromDifferentPackage obj = new TestAccessTypeFromDifferentPackage();
		obj.test1();
		obj.test3();
		// obj.test2(); compile time error
		// obj.test4(); compile time error
	}
}
