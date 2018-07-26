package u_stringInJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/*
 * lastIndexOf() method -  returns last index ( occurrence) of the given character value or substring.
 * If it is not found, it returns -1. 
 * The index counter starts from zero.
 */
public class Example17_lastIndexOf_IMP {

	public static void main(String[] args) {

		String s1 = "Vamsi Krishna Dadi";
		String s2 = "Dadi";
		
		int index1= s1.lastIndexOf('i');
		System.out.println(index1);
	
		// checking the last index of i but before 15th index ( it was after 15th index in case of indexOf method) 
		int index2= s1.lastIndexOf('i', 15);
		System.out.println(index2);
		
		// checking the last index of i but before 2nd index 
		int index3= s1.lastIndexOf('i', 2);
		System.out.println(index3);
		
		// checking the last index of string
		int index4= s1.lastIndexOf(s2);
		System.out.println(index4);
		
		// checking the last index of string but before 10th index
		int index5= s1.lastIndexOf(s2, 10);
		System.out.println(index5);
 
	}
}
