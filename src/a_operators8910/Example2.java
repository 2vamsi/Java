package a_operators8910;

public class Example2 {

	public static void main(String[] args) {

		int n = 0;
		int k = n++ + ++n;
		// System.out.println(n++);
		// System.out.println(++n);
		System.out.println(k);

		System.out.println("------------------------------");

		int i = 0;
		int j = i++ + i++;
		System.out.println(j);

		System.out.println("------------------------------");

		int p = 0;
		int q = p++ + ++p + ++p + p++;
		System.out.println(q);

		System.out.println("------------------------------");

		int o = 0;
		int m = o++ + ++o + ++o + o++ + ++o;
		System.out.println(m);
	}
}
