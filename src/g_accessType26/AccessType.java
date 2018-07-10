package g_accessType26;

/**
 * 
 * 
 * @author vamsi.dadi
 *
 * *         We have four types of Access Modifiers 
 *        	 1. Private 2. Public 3. Protected 4. Default 
 *         
 *   Access Level of each type :
 *     Access Type 	Within Class    	Outside Class 	Within Same Package 	Outside Package
 *     Public 		Yes 				Yes 			Yes 					Yes 
 *     Private 		yes 				No 				No 						No 
 *     Protected    yes 				Yes 			Yes 					Yes(Through Inheritance) 
 *     Default 		yes 				Yes 			Yes 					No (even through inheritance)
 * 
 */
public class AccessType {

	public int i;
	private int j;
	protected int k;
	int d;// when we don't write anything, it means the access type is Default

	public void test1() {

	}

	private void test2() {

	}

	protected void test3() {

	}

	void test4() { // default

	}

	public static void main(String[] args) {
		AccessType obj = new AccessType();

		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();

		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.d);
	}
}