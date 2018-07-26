package v_stringBuffer;

/*
 *  capacity() method of StringBuffer class returns the current capacity of the buffer. 
 *  The default capacity of the buffer is 16. 
 *  If the number of character increases from its current
 *  capacity, it increases the capacity by (oldcapacity*2)+2. 
 *  
 *  For example if your current capacity is 16, it will be (16*2)+2=34.
 */
public class Example7_capacity {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //16
		
		sb.append("Test");
		System.out.println(sb.capacity()); //16
		
		sb.append("Java Supports multiple OS");
		System.out.println(sb.capacity()); //34
	}
}
