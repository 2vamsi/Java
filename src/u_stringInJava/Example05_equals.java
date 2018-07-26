package u_stringInJava;

/*
 * In String comparison, 
 * 'equals' checks for the content, not for the object reference
 * where as '==' checks for the object reference first 
 */

public class Example05_equals {

	public static void main(String[] args) {
		
		String s1 ="Vamsi";
		String s2= "Vamsi";
		String s3 = new String("Vamsi");
		
		//true - because == checks for the object reference and both refer to same instance
		System.out.println(s1==s2);
		
		// false - because s3 refers to the instance created in non-constant pool
		System.out.println(s1==s3);
		
		// true - because equals check for the content, not for the object reference
		System.out.println(s1.equals(s3));
		
	}
}
