package b_staticAndNonstatic21;

/*
Static Members are the class members, we can directly access them using class name

Non-Static members are object members, so we need to access them using object
( we will get a compile time error, if we access them using Class name)

*/
public class Example1 {

	
	int i =90;
	static int j = 80;
	
	public void test1() {
		
		System.out.println("I am test1 method");
	}
	
	public void test2() {
		
		System.out.println("I am test2 method");
	}
	
	public static void test3() {
		
		System.out.println("I am test3 method");
	}
	
	
	public static void main(String[] args) {
		
		Example1 obj = new Example1();
		
		obj.test1();
		obj.test2();
	//	Example1.test2(); compile time error as it is non-static member of the class
		Example1.test3();
		
		System.out.println(obj.i);
	//	System.out.println(Example1.i); compile time error, as it is non-static member
		System.out.println(Example1.j); 
	}
}
