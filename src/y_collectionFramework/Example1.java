package y_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example1 {

	
	public static void main(String[] args) {
		// List is the interface and ArrayList & LinkedList are classes
		
		List list = new ArrayList<>();
		
		/*
		 * we can add any kind of data here, as the data type is not defined
		list.add(9); // adding integer
		list.add(true);// adding boolean
		list.add(7.09) // adding double
		
		 * 
		 */
		List list1 = new LinkedList<>();
		
		// we can use angular brackets to define the data type which these
		//will take 
		
		// below will take only integer type of data
		List <Integer> l1= new ArrayList<Integer>();
		List <Integer> l2 = new LinkedList<Integer>();
		
		// above we created the reference of List interface 
		
		// we can also create the reference of ArrayList like below
		
		ArrayList<String> a1 = new ArrayList<String>();
		LinkedList<String> a2 = new LinkedList<String>();
		
		// when we define type as Object, they will take any kind of data
		// as Object is the super class of all the classes
		ArrayList<Object> a11 = new ArrayList<Object>();
		LinkedList<Object> a12 = new LinkedList<>();
		// eventhough we do not write Object for the LinkedList above ( right side)
		//it will take only object kind of data
		
		
		
		
		/*
		 * Now same applies to set also
		 */
		
		//Set is the interface and HashSet, LinkedHashSet are the classes
		
		Set set = new HashSet<>();
		Set set1 = new LinkedHashSet<>();
		Set set2 = new TreeSet<>();
		
		// making set class to accept only the required type of data
		Set<Integer> set3 = new HashSet<Integer>();
		Set<String> set4 = new LinkedHashSet<String>();
		Set<Object> set5 = new TreeSet<Object>();
		// When we write Object, this TreeSet will take any kind of data
		
		set5.add(20);
		set5.add(false);
		
		
		
		// same thing we can write like below as well
		// we can create the reference of class and object of class, which is allowed in Java
		HashSet<Integer> set6 = new HashSet<Integer>();
		HashSet<String> set7 = new HashSet<String>();
		TreeSet<Object> set8 = new TreeSet<Object>();
			// When we write Object, this TreeSet will take any kind of data
	
		
		/*
		 * Map Interface
		 */
		
		// below is an example of non-generic, where we can insert any kind of data
		Map  m1 = new HashMap<>();
		Map  m2 = new LinkedHashMap<>();
		Map  m3 = new TreeMap<>();
		
		// map takes key value pair, key as Integer and Value as String (which is its syntax)
		Map<Integer, String>  m4 = new HashMap<Integer, String>();
		Map<Integer, String>  m5 = new LinkedHashMap<Integer, String>();
		Map<Integer, String>  m6 = new TreeMap<Integer, String>();
		
		// same thing we can achieve by making reference of class and object of class
		// both are fine
		HashMap<Integer, String>  m7 = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String>  m8 = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String>  m9 = new TreeMap<Integer, String>();
		
		
		// There is something called Hash table and there is only Hash table class in it
		//Again it implements Map interface, so.. 
		Map<Integer, String> table = new Hashtable<Integer, String>();
		
		// For hash table also we can create the reference of table and object of table
		Hashtable<Integer, String> table1 = new Hashtable<>();
		
		
		/*
		 * Map Interface
		 */
		
		// In collection classes, we can store the custom class object also
		// below is creating an object of arraylist which takes person kind of data
		ArrayList<A_Person> p1 = new ArrayList<A_Person> ();
		
		// Person kind of data means,we can create the object of person class
		
		A_Person o1 = new A_Person(20, 2000);
		A_Person o2 = new A_Person(20, 200);
		A_Person o3 = new A_Person(20, 3000);
		
		p1	.add(o1);
		p1.add(o2);
		
		
		// Same thing we can do with linked list also
		LinkedList<A_Person> p2 = new LinkedList<A_Person> ();
		p2.add(o3);
		
		//same thing we can do with set also
		HashSet<A_Person> p3 = new HashSet<A_Person> ();
		p3.add(o1);
		
		
	}
}
