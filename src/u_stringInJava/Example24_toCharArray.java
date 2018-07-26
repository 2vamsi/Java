package u_stringInJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/*
* toCharArray() method converts the given string into character array.
*/
public class Example24_toCharArray {
	public static void main(String[] args) {
		String s1 = new String("Vamsi");
		char[] ch = s1.toCharArray();
		for(int i=0; i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
}
