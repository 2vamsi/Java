package v_stringBuffer;

/*
 * The delete() method of StringBuffer class - deletes the string from the specified begin Index 
 * till the specified end Index.
 */
public class Example5_delete {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Learn Java");
		sb.delete(0, 3);// to delete the given string from index 0 to 2
		System.out.println(sb); //rn Java
 



	}
}
