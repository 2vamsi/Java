package a_operators8910;

public class Example3 {

	public static void main(String[] args) {

		int i = 0;

		int p = ++i + i++ + --i + i-- + i;
		System.out.println(p);

		int j = 0;
		int l = j++;
		System.out.println(l);

		System.out.println(j);
	}
}
