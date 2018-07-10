package b_controlStatements11to19;

public class Example8 {

	public static void main(String[] args) {

		// example2 of Labeled for loop

		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (j == 2) {
					System.out.println("value of i: " +i+" "+"value of j: "+j);
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}