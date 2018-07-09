package aa_controlStatements11to19;

public class Example4 {

	public static void main(String[] args) {

		// example of nested if
		
		int i = 13;
		if (i > 10) {
			if (i < 15) {
				System.out.println("i is smallar than 15");

				if (i < 12) {

					System.out.println("is is smallar than 12");
				} else {
					System.out.println("i is greater than 12");

				}
			}
		}
	}
}
