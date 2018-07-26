package v_stringBuffer;

/*
 * The replace() method replaces the given string from the specified begin Index 
 * till specified end Index.
 */
public class Example4_replace {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Java ");
		sb.replace(1, 3, "-test-");// to replace the given string from index 1 to 2
		System.out.println(sb); //J-test-a 



	}
}
