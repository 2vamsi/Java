package superKeywordInJava37;


/*When we don’t write super keyword in child class constructor, java compiler
will provide super() calling statement as first line of child constructor.


*/
public class J extends I {
	
	J() {
		//here java compiler will keep super() by default when we do not write
		System.out.println("J");
	}

	public static void main(String[] args) {
		
		J obj = new J();
		
		
	}
	
	
}
