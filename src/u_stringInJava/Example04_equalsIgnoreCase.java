package u_stringInJava;

/*
 * String comparison using  :
 * 'equals' and 'equalsIgnoreCase' methods 
 * 
 * equals() method -  compares the two given strings based on the content of the string. 
 * If any character is not matched, it returns false.
 * If all characters are matched, it returns true.
 * 
 * equalsIgnoreCase() method - compares the two given strings on the basis of content of 
 * the string irrespective of case of the string. 
 * It is like equals() method but doesn't check case.
 * If any character is not matched, it returns false otherwise it returns true.
 */
public class Example04_equalsIgnoreCase {

	public static void main(String[] args) {
		
		String s1 = "vamsi";
		String s2 = "vamsi";
		String s3 = new String("vasmi");
		String s4 = "krishna";
		
		
		System.out.println(s1.equals(s2));  // true 
		System.out.println(s2.equals(s3));  // false 
		System.out.println(s3.equals(s4));  // false
		
		
		System.out.println("--------------------------");
		
		String s5 = "Dadi";
		String s6 = "DADI"; 
		String s7 = "Vamsi";
		
		System.out.println(s5.equals(s6)); // false 
		System.out.println(s5.equalsIgnoreCase(s6)); // true
		System.out.println(s7.equalsIgnoreCase(s5)); // false
	}
}
