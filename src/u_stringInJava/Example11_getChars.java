package u_stringInJava;

import java.io.UnsupportedEncodingException;

/*
 * Usage of  string method - 
 * getChars() method -  is used to copy characters from one array to another array
 * 
 */
public class Example11_getChars {

	public static void main(String[] args) {

		String str = new String("This is a String Tutorial");

		char[] array = new char[6];
		str.getChars(10, 16, array, 0);
		// this method will push data in array from 10th to 15th index.
		// and will copying the data into array,  from 0th index
		System.out.print("Array Data: ");
		for (char temp : array) {
			System.out.print(temp);
		}

		System.out.println();
		System.out.println("----------------------------------");
		
		char[] array2 = new char[] {'a','b','c','d','e','f','g','h'};
		// here we already have some chars in array
		// we can chose what chars to leave and what to override
		// by mentioning the right index
		str.getChars(10, 16, array2, 2);
		System.out.print("2nd Array Data: ");
		for (char temp: array2)
		{
			System.out.print(temp);
			}
		}
}
