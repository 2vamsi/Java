package v_stringBuffer;

/*
 * String Buffer is used to create Mutable String, which means we can modify the String once it is created. 
 * The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
 */
public class Example1 {

	public static void main(String[] args) {
		
		
		String s1 = "Test1";
		s1.concat("htest");
		System.out.println(s1);
		
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("test"); // append is a method of string buffer class
		System.out.println(sb);
		
	}
}
