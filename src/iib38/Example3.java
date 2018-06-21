package iib38;


/*Let’s say we want a for loop to fill a complex array before object creation. Which
we can achieve through IIB. Below example shows the same
*/

public class Example3 {

	int a[];

	
	//iib starts
	{
		a = new int[10];
		for (int i = 0; i < 10; i++) {

			a[i] = i;
		}
	}
	//iib ends
	
	void display() {

		System.out.println("[");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {

		Example3 obj = new Example3();
		obj.display();
	}

}
