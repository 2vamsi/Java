package encapsulation41;

public class Example3 {

	public static void main(String[] args) {

		Example2 obj = new Example2();
		obj.setAge(50);
		System.out.println(obj.getAge());

		// if we don't set age and try to get the age
		// we will get 0 as output

		Example2 obj1 = new Example2();
		System.out.println(obj1.getAge());

	}
}
