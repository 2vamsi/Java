package iib38;

/*
If we crate n objects of class, each IIB will get executed n times.
Below example shows the same
*/


/*
Main Rules of Instance initializer block: 

Rule1 : the moment an object is created, iib will get created and when we run java program, 
iib will get executed first
*/


public class Example4 {

	
	{	
		System.out.println("I am IIB first");
	}
	
	{
		System.out.println("I am IIB second");
	}
	
	public static void main(String[] args) {
		
		Example4 obj = new Example4();
		System.out.println("-------------------");
		
		Example4 obj1 = new Example4();
		System.out.println("-------------------");
		
		Example4 obj2 = new Example4();
		System.out.println("-------------------");
	}
}
