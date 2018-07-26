package u_stringInJava;

/*
 * Usage of  string methods - 
 * 	contains() method -  searches the sequence of characters in this string. 
 * It returns true if sequence of char values are found in this string	
 * otherwise returns false.
 * 
 * endsWith() method -  checks if this string ends with given suffix. 
 * It returns true if this string ends with given suffix else returns false.
 */


public class Example07_contains {

	public static void main(String[] args) {
		
		String name ="Vamsi Krishna Dadi";
		
		System.out.println(name.contains("Vamsi"));//true
		System.out.println(name.contains("vamsi"));//false
		System.out.println(name.contains("vasmi")); // false
		System.out.println(name.contains(" ")); // true
		
		
		System.out.println(name.endsWith("Dadi"));//true
		System.out.println(name.endsWith("Krishna"));//false
		System.out.println(name.endsWith("a"));//false
		
	}
}
