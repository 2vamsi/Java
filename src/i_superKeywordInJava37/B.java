package i_superKeywordInJava37;
/*

• super can be used to refer immediate parent class instance variable. means : 

using super we can call the variable of parent class, although same variable is
available in child class

Below Example shows it
*/

public class B extends A{

	String color = "B Black";
	
	void printColor() {
		
		System.out.println(color); // Prints color of B Class
		System.out.println(super.color);// Prints color of A Class
		
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.printColor();

	}
}
