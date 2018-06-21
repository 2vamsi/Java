package inheritanceInJava30to33;
/**
 * 
 * 
 * /we can not inherit the constructor from one class to another class in case of parameterized 
 * constructor 
 *
 *it can be done for default constructor
 */
public class ChildClass3 extends ParentClass3{
	
	public static void main(String[] args) {
		
	ChildClass3 obj = new ChildClass3();
	
	ChildClass3 obj = new ChildClass3(7);
	
		
		
	}

	
}
