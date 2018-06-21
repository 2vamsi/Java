package accessTypeTest26;

import accessType26.AccessType;

/**
 * 
 * when we try to access class members from different package & class Without
 * inheritance , we can access only public
 * 
 * we can not access private, protected and default members
 *
 */
public class TestAccessTypeFromDifferentPackage1 {

	public static void main(String[] args) {

		AccessType obj = new AccessType();
		obj.test1(); // we are able to access only Public method
		// obj.test2(); compile time error
		// obj.test3(); compile time error
		// obj.test4(); compile time error
	}
}
