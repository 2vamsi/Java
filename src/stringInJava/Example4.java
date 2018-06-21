package stringInJava;

public class Example4 {

	public static void main(String[] args) {
		
		// both s1 and s2 will point to same object in constant pool
		
		String s1 = "test1";
		String s2 = "test1";
		
		// both s3 and s4 will point to different objects in non-constant pool 
		
		String s3 = new String("Test3");
		String s4 = new String("Test3");
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
