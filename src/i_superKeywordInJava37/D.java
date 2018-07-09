package i_superKeywordInJava37;
/*

• super can be used to invoke parent class method.

i.e. using super we can call the method from parent class, when same method is also
available in child class

*/

public class D extends C {

	void eat() {

		System.out.println("eat from D class");
	}

	void bark() {

		System.out.println("bark from D class");
	}

	void work() {

		super.eat(); // eat from Parent class will be executed
		bark(); // bark from Child class will be executed
	}

	public static void main(String[] args) {

		D obj = new D();
		obj.work();
	}
}
