package u_stringInJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/*
* substring() method - returns a part of the string.
* String substring(int beginIndex): Returns the substring starting from the 
* specified index(beginIndex) till the end of the string.
* 
* This method throws IndexOutOfBoundsException If the beginIndex is 
* less than zero or greater than the length of String
*/
public class Example23_subString {

	public static void main(String[] args) {

		String s1 = new String("Vamsi Krishna Dadi");
		System.out.println(s1.substring(3)); //si Krishna Dadi ( i.e. from 3rd index till end)
		System.out.println(s1.substring(3, 11)); //si Krishna Dadi ( i.e. from 3rd  till 10th index)
	}
}
