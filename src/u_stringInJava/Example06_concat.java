package u_stringInJava;

/*
 * String concatenation using + operator and concat method. 
 */

public class Example06_concat {

	public static void main(String[] args) {
		
		String s1 ="Vamsi"+"Krishna";
		System.out.println(s1);
		
		// once a string is concatenated, it becomes a string and then string concatenation happens
		String s2 = 40+30+"Dadi"+40+30;
		System.out.println(s2);
	
		
		String s3 = "Test1";
		// concat method will not work here, as we are trying to change in the same reference
		s3.concat("Test56");
		System.out.println(s3);
		
		
		// concat method works with new reference
		s3 = s3.concat("Test56");
		System.out.println(s3);
		
		String s4 = "Test2";
		// concat method works with new reference
		String s5 = s3.concat(s4);
		System.out.println(s5);
		
	}
}
