package u_stringInJava;

import java.io.UnsupportedEncodingException;

/*
 * Usage of string method - 
 * isEmpty() method - checks if this string is empty. 
 * It returns true, if length of string is 0 otherwise false.
 */
public class Example14_isEmpty {

	public static void main(String[] args) {

		String s1 = "";
		String s2 = "Vamsi";
		
		System.out.println(s1.isEmpty()); // true as the length is zero
		System.out.println(s2.isEmpty());// false as the length is not zero
	}
}
