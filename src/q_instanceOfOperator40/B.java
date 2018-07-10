package q_instanceOfOperator40;


// Example for instance of sub-class
// B is a child class and A is a parent class here

public class B extends A {
	
  public static void main(String[] args) {
	
	  B obj = new B();
	 System.out.println(obj instanceof A); // will print true
}

}
