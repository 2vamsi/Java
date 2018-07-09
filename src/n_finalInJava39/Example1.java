package n_finalInJava39;


/*

# Final keyword is used to restrict the user to change the implementation
of method or the initialized value of variable.

# We can make variable as a final

we can make method as final, using which we can not change the implementation

We can make class as final


*/


public class Example1 {

	final int k= 10;
	
	void test1() {
		
		// when we try to change the value of final
		// we will get compile time error
		//k=20;
		System.out.println(k);
	}
	
	
	public static void main(String[] args) {
		
		Example1 obj= new Example1();
		obj.test1();
	}
}
