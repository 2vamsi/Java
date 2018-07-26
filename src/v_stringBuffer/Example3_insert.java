package v_stringBuffer;

/*
 * insert() method inserts the given string in the existing string at the given position.
 */
public class Example3_insert {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Java ");
		sb.insert(2, "-abc123");// to insert abc123 in second position/ index
		System.out.println(sb); //Jaabc123va 

	}
}
