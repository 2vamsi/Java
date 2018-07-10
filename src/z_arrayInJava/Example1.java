package z_arrayInJava;

public class Example1 {

	public static void main(String[] args) {

		int a[] = new int[5];// declaration and instantiation

		a[0] = 1; // initialization
		a[1] = 2;
		a[2] = 7;
		a[3] = 4;
		a[4] = 5;

		// printing the size of array
		System.out.println(a.length);
		
		// printing array
System.out.println("-------------------------------");
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);

			// if we try to print a[5] -> ( by giving i<= a.length ) 	 we will get arrayIndexOutOfBoundException
		}

	}

}
