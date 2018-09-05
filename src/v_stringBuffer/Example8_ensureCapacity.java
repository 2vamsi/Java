package v_stringBuffer;

/*
 *  The ensureCapacity() method of StringBuffer class ensures that the 
 *  given capacity is the minimum to the current capacity. 
 *  
 *  If it is greater than the current capacity, it increases the capacity by 
 *  (oldcapacity*2)+2. 
 *  
 * For example if your current capacity is 16, it will be (16*2)+2=34.
 * 
 * Ensure capacity will only increase the capacity, can not decrease it. 
 */

public class Example8_ensureCapacity {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //16
		
		sb.append("Test");
		System.out.println(sb.capacity()); //16
		
		sb.append("Java Supports multiple OS");
		System.out.println(sb.capacity()); //34
		
//		sb.append("Java Supports multiple OS");
//		System.out.println(sb.capacity()); //70
//		
		sb.ensureCapacity(10);
		System.out.println(sb.capacity()); //34
		
		sb.ensureCapacity(100);
		System.out.println(sb.capacity()); //100
	}
}
