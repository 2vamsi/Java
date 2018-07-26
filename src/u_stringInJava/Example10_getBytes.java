package u_stringInJava;

import java.io.UnsupportedEncodingException;

/*
 * Usage of  string method - 
 * getBytes() method -  is used to  convert the string into bytes i.e. to encode the character 
 * different ways of encoding your character ( write into pdf notes, it is not there) 
 */
public class Example10_getBytes {

	public static void main(String[] args) {
		
		String str =new String("Vamsi");
		byte[] array1 = str.getBytes();
		System.out.println("Default Charset encoding: ");
		for (byte b: array1) {
			System.out.println(b);
		}
		
		System.out.println("----------------------");
		// encoding of the characters into UTF-16 standard/ format
		System.out.println("UTF-16  Charset encoding: ");
		try {
			byte[]array2 = str.getBytes("UTF-16");
			for (byte b1: array2) {
			System.out.println(b1); 		}
			System.out.println();
		
		
		System.out.println("----------------------");
		byte[] array3 = str.getBytes("UTF-16BE");
		// encoding of the characters into UTF-16 standard/ format
		System.out.println("UFT-16BE  Charset encoding: ");
		for (byte b2: array3) {
			System.out.println(b2);
		}
		System.out.println();
		
	} catch (UnsupportedEncodingException ex) {
		System.out.println("Unsupported character set "+ ex);
	}
}
}
