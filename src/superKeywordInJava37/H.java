package superKeywordInJava37;

public class H extends G {
	
	H() {
		super(7);
		//super(); this will call default construtor 
		System.out.println("H is created ");
	}
	
	public static void main(String[] args) {
		
		H obj = new H();
		
	}
}
