package y_collectionFramework;

public class A_Person {

	int age;
	int salary;
	
	// 2. right click anywhere inside the program  > Source > Generate Constructor 
	// using fields , you will see below code. 
	
	
	public A_Person(int age, int salary) {
		super();
		this.age = age;
		this.salary = salary;
	}
	
	

	// 1. Select above 2 lines , right click  > Source > Generate getters and setters
	// you will see below code
	
	
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
