
package k_superKeywordInJava37;

/*
Ream Time use of super.

*/
public class Emp extends Person {

	float salary;
	// constructor below
	Emp(int id, String name, float slary) {

		super(id, name);
		this.salary = slary;
	}

	void display() {

		System.out.println("id: " + id + " name: " + name + " salary: " + salary);
	}

	public static void main(String[] args) {
		Emp obj = new Emp(4, "Bhanu", 900f);

		obj.display();
	}

}
