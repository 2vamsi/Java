package u_stringInJava;

/*
 * Usage of  string method - 
 * 	charAt() - returns char value for the particular index
 */
public class Example08_charAt {

	public static void main(String[] args) {
		
		String name ="Vamsi Krishna";
		System.out.println(name.charAt(7));
		// System.out.println(name.charAt(20)); - gives StringIndexOutOfBoundsException
	}
}
