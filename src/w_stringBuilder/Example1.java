package w_stringBuilder;

/*
 * Java StringBuilder class is same as StringBuffer class except that it is 
 * non-synchronized. 
 * 
 * Note: All the methods that work for stringBuffer will also work for StringBuilder class.
 * 
 * StringBuilder is more efficient than StringBuffer as it is not thread-safe / 
 * as it is non-synchronized (i.e. multiple threads can access the object at same time )
 */

public class Example1 {

	public static void main(String[] args) {
		

	StringBuffer sb = new StringBuffer();
	StringBuilder sd = new StringBuilder();
	sb.append("test"); //test
	sd.append("test"); // test

	System.out.println(sb);
	System.out.println(sd);
	
	
	sd.append('c');
	System.out.println(sd);
	
	sd.insert(2, 'c');
	System.out.println(sd);
	
	sd.replace(1, 3, "hello");
	System.out.println(sd);
	
	sd.delete(0, 2);
	System.out.println(sd);
	
	sd.reverse();
	System.out.println(sd);
	
	sd.capacity();
	System.out.println(sd.capacity());
	
	sd.ensureCapacity(40);
	System.out.println(sd.capacity());
	
	}
	
}
