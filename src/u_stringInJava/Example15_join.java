package u_stringInJava;

import java.io.UnsupportedEncodingException;

/*
 * Usage of string.join method - 
 * String.join method - returns a string joined with given delimiter. 
 * i.e. , delimiter is copied between elements.
 * 
 * In case of null element, "null" is added.
 */
public class Example15_join {

	public static void main(String[] args) {

		String str = String.join("^", "Vamsi", "Krishna", "");
		System.out.println(str);// Vamsi^Krishna^
	}
}
