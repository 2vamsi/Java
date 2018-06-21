package arrayInJava;

public class Example5 {

	public static void main(String[] args) {
		
		char[] copyFrom = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		char[] copyTo = new char[5];
		
		System.arraycopy(copyFrom, 0, copyTo, 0,5);
//		System.arraycopy(copyFrom, 3, copyTo, 2,3);
		
		System.out.println(copyFrom);
		System.out.println(copyTo);
		
	}
}
