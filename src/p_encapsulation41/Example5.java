package p_encapsulation41;

public class Example5 {

	public static void main(String[] args) {
		
		Example4 obj = new Example4();
		obj.setName("Vamsi");
		obj.setAge(35);
		obj.setIdNum("106190");
		
		System.out.println("Name: "+obj.getName());
		
		System.out.println("Age: "+obj.getAge());
		
		System.out.println("Id No. "+obj.getIdNum());
	}
	
}
