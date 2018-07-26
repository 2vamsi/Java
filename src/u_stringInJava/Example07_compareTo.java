package u_stringInJava;

/*
 * Usage of string method - 
 * 	compareTo() - method compares the given string with current string lexicographically. 
 * It returns a positive number or negative number or 0.
 * 
 * • if s1 > s2, it returns positive number 
 * • if s1 < s2, it returns negative number 
 * • if s1 == s2, it returns 0
 * 
 */
public class Example07_compareTo {
	public static void main(String[] args) {
		String s1 ="Vamsi";
		String s2 ="Krishna";
		String s3 ="Dadi";
		String s4 ="Vamsi";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s3.compareTo(s1));
		
		String s5 ="a";
		String s6 ="b";
		String s7 ="c";
		String s8 ="d";
		String s9 ="a";
		
		System.out.println(s5.compareTo(s9)); //0
		System.out.println(s6.compareTo(s7)); //-1
		System.out.println(s5.compareTo(s8)); // -3
		System.out.println(s8.compareTo(s5)); //3
		
	}
}
