package y_collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * how to store class type of data in ArrayList
 * 
 */
public class Example4 {

	public static void main(String[] args) {
		
		Person s1 = new Person(100, "Test1", 90);
		Person s2 = new Person(101, "Test2", 21);
		Person s3 = new Person(102, "Test3", 80);
		
		ArrayList <Person> al = new ArrayList<Person>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator<Person> itr = al.iterator();
		while(itr.hasNext()) {
			// data we get from array is object, we are casting it to change it back to person class
			Person st = (Person) itr.next();
			System.out.println(st.rollno+ " "+ st.name+ " "+ st.age);
		}
	}
}
