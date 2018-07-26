package u_stringInJava;

import java.io.UnsupportedEncodingException;

/*
 * Usage of  string method - 
 * indexOf() method - returns the index of the first occurrence of character ch in a String.
 * method returns a positive number if found and -1 (negative number) if not found. 
 * 
 */
public class Example12_indexOf_IMP {

	public static void main(String[] args) {

		String str1 = new String("This is Vamsi learning Java");
		String str2 = new String("Vamsi");
		String str3= new String("LEARN");
		String str4= new String("learn");

		// index of a character in the string
		System.out.println("Index of B in str1: "+ str1.indexOf('B'));
		System.out.println("Index of s in str1: "+ str1.indexOf('s'));
	
		// index of a character in the string after nth index /position
		System.out.println("Index of V in str1 after 15th char: "+ str1.indexOf('V', 15));
		System.out.println("Index of s in str1 after 3rd char: "+ str1.indexOf('s', 4));
		
		// index of a string in another string
		System.out.println("Index of string str2 in str1  "+ str1.indexOf(str2));
		System.out.println("Index of string str2 in str1 after 15th index  "+ str1.indexOf(str2, 15));
	
		System.out.println("Index of string st3 in str1  "+ str1.indexOf(str3));
		System.out.println("Index of string str3 in str1 after 15th index  "+ str1.indexOf(str3, 15));
	
		System.out.println("Index of string str4 in str1  "+ str1.indexOf(str4));
		System.out.println("Index of string str4 in str1 after 15th index  "+ str1.indexOf(str4, 15));
	
		// index of a hard coded string in a given string
		System.out.println("Index of hard coded string in str1  "+ str1.indexOf("is"));
		System.out.println("Index of hard coded string in str1 after 4th char  "+ str1.indexOf("is", 4));
	}
}
