package w_stringBuilder;

/*
 * StringBuilder is more efficient than StringBuffer as it is not thread-safe / 
 * as it is non-synchronized (i.e. multiple threads can access the object at same time )
 */

public class Example2 {

	public static void main(String[] args) {
		
	StringBuffer sb = new StringBuffer();
	StringBuilder sd = new StringBuilder();
	
	long startTime = System.currentTimeMillis();
	for(int i=0; i<100000;i++) {
		sb.append("By Vamsi");
	}
	
	long endTime = System.currentTimeMillis();
	System.out.println("TimeTaken for StringBuffer: "+(endTime-startTime));
	
	
	startTime = System.currentTimeMillis();
	for(int i=0; i<100000;i++) {
		sd.append("By Vamsi");
	}
	endTime = System.currentTimeMillis();
	System.out.println("TimeTaken for StringBuffer: "+(endTime-startTime));
	
	}

}
