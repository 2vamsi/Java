package u_stringInJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/*
 * Usage of string.join method - 
 * String.join method - returns a string joined with given delimiter. 
 * i.e. , delimiter is copied between elements.
 * 
 * In case of null element, "null" is added.
 */
public class Example16_join_2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Vamsi", "Krishna", "Dadi");
		String names= String.join("|", list);
		System.out.println(names); //Vamsi|Krishna|Dadi
 
	}
}
