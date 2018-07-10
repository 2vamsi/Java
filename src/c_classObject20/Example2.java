package c_classObject20;

public class Example2 {

	// field or data member  or instance variable
	int id;
	
	String name="Vamsi";
	
	public static void main(String[] args) {
		
		// creating an object
		Example2 s1 = new Example2();
		
		// calling the variable of the class, using object
	// we can not directly use s1.id , we can only print it
		
		System.out.println(s1.id);               //0
		System.out.println(s1.name);       // Vamsi

	}
	
}
