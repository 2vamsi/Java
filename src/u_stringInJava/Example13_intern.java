package u_stringInJava;

import java.io.UnsupportedEncodingException;

/*
 * Usage of  string method - 
 * intern() method - returns the interned string, i.e. 
 * It returns the canonical representation of string. 
 * It can be used to return string from pool memory, if it is created by new keyword.
 */
public class Example13_intern {

	public static void main(String[] args) {

		//s1 object will be created in non-constant pool
		String s1 = new String("Vamsi");
		
		//s2 object will be created in constant pool ( i.e. string pool)
		String s2 = "Vamsi";
		
		//returns string from pool, so it will be same as s2
		String s3= s1.intern();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s2); // false as reference is different
		System.out.println(s2==s3);// true as reference is same
	}
}
