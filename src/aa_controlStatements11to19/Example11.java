package aa_controlStatements11to19;

public class Example11 {

	//example of while loop
	
	public static void main(String[] args) {
		
		int n=0;
		
		int sum =0;
		while (n<=6) {
			
			sum = sum + n++;
			System.out.println("value of sum: "+sum);
			
		}
	}
}
