package p_finalInJava39;

public class Example8 {

	final int k;

	final static int i;

	// non static final is initialized only through constructor
	// not through method - see Example 1
	Example8() {

		k = 90;
	}

	//  static final is initialized through static block
	
	static {

		i = 90;
	}

	public static void main(String[] args) {
		//System.out.println(k);
		System.out.println(i);

	}
}