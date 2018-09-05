package y_collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		//Creating an array list object
		ArrayList <String> list = new ArrayList<String>();
		
		//adding objects into array list
		// here we can add only String data
		list.add("Vamsi");
		list.add("Krishna");
		list.add("Dadi");
		list.add(" Test 1 ");
		
		//Traversing list through Iterator to access and print them
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//itr.next - will get the current data from collection and move the pointer to next data
		}
	}
}
