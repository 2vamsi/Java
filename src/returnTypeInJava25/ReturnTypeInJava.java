
package returnTypeInJava25;

/**
 * 
 * 
 * In Java, we can not write a method without a return type
 * 
 * Even though method is not returning anything, we need to mention the return
 * type as void
 *
 */
public class ReturnTypeInJava {

	// return type is void as the method doesn't return any value
	public void test1() {
	}

	// method signature is integer, so return type must be integer data type
	public int test2() {
		return 3;
	}

	public double test3() {
		return 3.44;
		//return 3; will not give an error as double will take both decimal and integer
	}

	// when a method returns only true or false
	public boolean test4() {
		return true;
	}

	public char test5() {
		return 'z';
	}

	public String test6() {

		return "Test";
	}

	
	// this is another type of variable called class type which is nothing but object
	public ReturnTypeInJava test7() {
		return new ReturnTypeInJava();
	}

	// method type and return type is integer array here
	public int[] test8() {

		return new int[7];
	}

	public static void main(String[] args) {

		ReturnTypeInJava obj = new ReturnTypeInJava();

		obj.test2();
		obj.test3();

		System.out.println(obj.test2());

		System.out.println(obj.test3());

		System.out.println(obj.test4());

		System.out.println(obj.test5());

		System.out.println(obj.test6());

		System.out.println(obj.test7());

		System.out.println(obj.test8());


	}
}
