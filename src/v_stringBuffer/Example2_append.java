package v_stringBuffer;

/*
 * append() method of stringBuffer class - concatenates the given argument with the existing string.
 */
public class Example2_append {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Java ");
		sb.append("test"); // append is a method of string buffer class\
		System.out.println(sb);
		
	}
}
