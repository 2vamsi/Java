package finalInJava39;

public class Example3 extends Example2{

	
	// when we try to change the implementation of parent class ( method overriding) 
	//which is final - 
	// we will see compile time error
final public void test() {
	
	int sum = 2+3;
	System.out.println(sum);
}
}
