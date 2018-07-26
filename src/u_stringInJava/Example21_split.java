package u_stringInJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/*
*split() method - splits a string against given delimiter (regular expression) and
*  returns array of strings.
*/
public class Example21_split {

	public static void main(String[] args) {

		String s1 = "Vamsi Krishna Dadi";
		String[] data  = s1.split(" ");
		for(String w: data) {
			System.out.println(w);
		}
	}
}
