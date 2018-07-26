package u_stringInJava;

/*
 * 
 * Example to show that - a String is an Immutable class, which means we can not
 * modify once it is created
 *
 */
public class Example02 {

public static void main(String[] args) {
	
	String s1 = "Learn";
	s1.concat("Java");
	
	System.out.println(s1);
}

}
