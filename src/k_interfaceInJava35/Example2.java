package k_interfaceInJava35;


/*

Class has to implement the interface

in case of inheritance we use extends

in case of interface we use implements

the moment we implement any interface, we need to write the implementations of all methods which we have 
in the interface

 we can write the reference of an interface, which is allowed in java

we cannot create the object of interface , it is not allowed
 
*/
public class Example2 implements Example1, RateOfInterest {

	//multiple inheritance is not possible using classes ( using extends keyword)
	// it is possible using interfaces ( i.e. using implements keyword) 
	
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public void rateofInterest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char test3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int test4() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {

		// we can write the reference of an interface, which is allowed in java
		Example1 obj = new Example2();

		obj.test1();
		obj.test2();
	
		// we cannot create the object of interface , it is not allowed
		//Example1 obj1= new Example1();
		
		
	}
	
}
