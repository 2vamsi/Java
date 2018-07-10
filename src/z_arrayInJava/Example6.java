package z_arrayInJava;

public class Example6 {

	public static void main(String[] args) {
		
		// creating two 2D arrays
		int a[][] = {{1,2,3}, {4,5,6}};
		int b[][] = {{1,2,3}, {4,5,6}};
		
		// creating another 2D array to store the sum of the above arrays
		
		int c[][] = new int[2][3];
		
		// adding and printing addition of 2 matrices

		// external for loop runs on the row
		// internal for loop runs on the column
		
		for (int i=0; i < 2; i++) {
			for (int j=0;j<3; j++) {
				c[i][j] = a[i][j]+b[i][j];
							System.out.print(c[i][j] + " ");
				
			}
			// just to print in new line
			System.out.println();
		}
	}
}
