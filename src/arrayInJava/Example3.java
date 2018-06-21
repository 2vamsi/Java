package arrayInJava;

public class Example3 {

	public static void main(String[] args) {

		// declaring and initializing 2D array
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		// Printing the length of a 2D array
		System.out.println(arr.length);
		
		// printing 2D array

		
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j <arr.length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}
}
