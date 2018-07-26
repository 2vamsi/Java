package u_stringInJava;

/*
 * Usage of  string method - 
 * 	format() method -  returns the formatted string by given locale, format and arguments. 
 * If you don't specify the locale in String.format() method, it uses default locale 
 * by calling Locale.getDefault() method.
 */
public class Example10_format {

	public static void main(String[] args) {
		
		String str ="Vamsi Krishna Dadi";
		String str1 = String.format("My Name is %s", str);
		String str2 = String.format("My earning is %.8f", 47.455); //.8f means to show the value upto 8 decimal points
		String str3 = String.format("My savings is %15.4f", 10.45); //%15 means to give 15 spaces before the value
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("--------------------");
		String str4 = "Vamsi";
		String str5 = "Krishna";
		String str6 = String.format("My Name"+ " is :%1$s, %1$s and %2$s", str4,str5 );
		System.out.println(str6);
		
		
		System.out.println("--------------------");
		int num = 1234;
		String str7 = String.format("%07d", num );
		System.out.println(str7);
		//Out put will be 0001234, i.e. in total 7 digits
		
	}
}
