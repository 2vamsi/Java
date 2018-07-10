package o_iib38;

public class Example2 {

	int speed;
	
	Example2() {
		
		System.out.println("Speed is: "+speed);
	}
	
	
	// iib starts
	{
		speed = 100;
	}
	// iib ends 
	public static void main(String[] args) {
		
		Example2 b1 = new Example2();
		Example2 b2 = new Example2();
		
// when we create the object of the class, constructor will get called ****
// since we created 2 objects, it is called twice and the outcome will be:
		
//		Speed is 100
//		Speed is 100	
	
	}
}
