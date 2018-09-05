package y_collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
		ArrayList <String> array = new ArrayList<String>();
		
		//adding objects into array list
		// here we can add only String data
		array.add("Vamsi");
		array.add("Krishna");
		array.add("Dadi");
		array.add(" Test 1 ");
		
		//This is another way of iterating over 
		//Traversing list through Iterator to access and print them
		for (String obj : array)
			System.out.println(obj);
	}
}
