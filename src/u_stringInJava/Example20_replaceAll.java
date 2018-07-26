package u_stringInJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/*
replaceAll() method returns a string after replacing all the sequence of characters 
matching replacement string / regex.

Note: replace is for characters & 
replaceAll is for Strings. 
However, we can use replace for both strings and chars
But, we can not use replace all for characters
 */
public class Example20_replaceAll {

	public static void main(String[] args) {
		String s1 = "I am Vamsi Krishna Dadi I am Vamsi Krishna";
		String s2 = s1.replaceAll("Vamsi", "Uday");
		String s3 = s1.replace("Vamsi", "Uday");
		//String s4 = s1.replaceAll('a', 'e'); // you will get an error
		System.out.println(s2);
		System.out.println(s3);
	}
}
