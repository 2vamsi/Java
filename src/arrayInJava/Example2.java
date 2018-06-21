package arrayInJava;

public class Example2 {

	public static void main(String[] args) {

		// single dimentioanl array 
		int a[] = { 10,20, 30, 40 }; // another way of initialization

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

		System.out.println("-----------------------");
		// multi dimentional array
		
		int[][] arr = new int[5][5];
		arr[0][0] = 1;
		arr[0][1] = 20;
		arr[1][0] = 10;
		arr[1][1] = 50;

	}
}
