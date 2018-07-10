package z_comments44;


/*We have 3 types of comments in java : 
	Single line - to comment one line 

	Multi line - to comment  multiple lines at one go

	block comments - to explain / describe a block of code
*/

// single line 

/*
Multi line
Multi line
Multi line
*/


public class Example1 {

	/**
	 * Block comments - usually written to describe the method , at the top of method 
	 */
	void test1() {
		
		System.out.println("I am test1");
		//System.out.println("I am test1");
		
		
		/*System.out.println("I am test1");
		System.out.println("I am test1");
		System.out.println("I am test1");*/
		
		System.out.println("I am test1");
		
		
	}
	
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.test1();
	}


}
