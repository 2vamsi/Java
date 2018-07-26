package u_stringInJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/*
replace() method returns a string after replacing all the old char or CharSequence
 to new char or CharSequence.
 */
public class Example19_replace {

	public static void main(String[] args) {

		String s1 = "Vamsi Krishna Dadi";
		String s2 = s1.replace('a', 'e');
		System.out.println(s2);
 
	}
}
