package u_stringInJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/*
* startsWith() method - checks if this string starts with given prefix or not.
* It returns true if the string starts with, else returns false.
*/
public class Example22_startsWith {

	public static void main(String[] args) {

		String s1 = "Vamsi Krishna Dadi";
		System.out.println(s1.startsWith("Vamsi")); //true
		System.out.println(s1.startsWith("vamsi")); // false
		System.out.println(s1.startsWith("Va")); //true
		System.out.println(s1.startsWith("Dadi")); // false
		

	}
}
