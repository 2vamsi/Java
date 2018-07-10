package k_superKeywordInJava37;

/*
• super() can be used to invoke immediate parent class constructor.

*/
public class F extends E {
	
	F(){
		
		super(); // you will get same output even if you comment super();
	//	Note: First line of default constructor should be Super(); always
		//even though we do not write it, compiler will do it on behalf of us
		System.out.println("F is created");
	}

	public static void main(String[] args) {
		F obj = new F();

	}
}
