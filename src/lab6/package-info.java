package lab6;
/*
 package day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 
 * Collections
 * 
 *    represent group of elements as single entity
 *     Iterable(I)
 *      Collection(I)/Collections(C)
 *        List(I), Set(I), Queue(I)
 *        
 *        List(I) - Implementation classes
 *          ArrayList(C) -
 *             - insertion order to be maintained
 *             - duplicates allowed
 *             - null values are allowed
 *             - Heterogeneous elements are allowed
 *             - Based on Dynamic array
 *             - re-sizable
 *             - methods are not synchronized
 *             - not thread safe
 *             - can be accessed using index
 *             - initial capacity - 10
 *             - incremental capacity - (current capacity * 3/2)+1
 *             - frequent operation retrieval
 *             - able to access elements randomly
 *          
 *          LinkedList(C) - 
 *             - insertion order to be maintained
 *             - duplicates allowed
 *             - null values are allowed
 *             - Heterogeneous elements are allowed
 *             - Based on Doubly linked list (data structure)
 *             - re-sizable
 *             - methods are not synchronized
 *             - not thread safe
 *             - can be accessed using index
 *             - frequent operation insertion and deletion
 *              
 *          Vector 1.0(C) -
 *               - Legacy class
 *               - methods are synchronized
 *               - thread safe
 *               - insertion order to be maintained
 *             	 - duplicates allowed
 *               - null values are allowed
 *               - Heterogeneous elements are allowed
 *               - re-sizable
 *               - peformance is slower compared to ArrayList
 *               - initial capacity 10
 *               - incremental capacity - current capacity * 2
 *               - 
 *               
 *          Stack(C) - 1.0v
 *               - LIFO
 *               - Sub class of Vector
 *               - pop() - removes last inserted element
 *               - peek() - it return last inserted element
 *               - push() - add elements
 *               - Thread safe
 *                 
 *          
 *        Set(I) - Implementation classes
 *          HashSet(C)
 *            LinkedHashSet(C)
 *          SortedSet(I)
 *            NavigableSet(I)
 *          	TreeSet(C)
 *          
 *        Queue(I) - Implementation classes
 *          PriorityQueue(C) - FIFO
 *          LinkedList(C)
 *          DQueue(I) - can be accessed elements from both sides
 *           ArrayDQueue(C)
 *          
 *          
 *       How do you iterate?
 *         for loop - supports all classes
 *         foreach loop - supports all classes
 *         Iterator -  Universal cursor
 *         ListIterator - ArrayList & LinkedList
 *         Enumeration - Vector
 *         
 *       Generic classes -
 *          - data type to be mentioned
 *          - type casting not required reading. 
 *          
 */
/*
public class CollectionDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(null);
		list.add(null);
		list.add(20);
		list.add(true);
		list.add("aa");
		list.add(10.23f);
		
		List list2 = new ArrayList();
		list2.add(100);
		list2.add(200);
		
		// Add other collection elements
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println(list.get(0)); // 10
		System.out.println(list.get(1)); // 20
		
		
		// search 
		System.out.println(list.contains(30)); // true
		
		// set(), remove(), removeAll(), clear, isEmpty(), indexOf(), lastIndexOf(), removeIf(), subList(), toArray()
	
		
		// Iterate arraylist
		for(int i =0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		// Iterator - import java.util.Iterator
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		// ListIterator - import java.util.ListIterator
		// Reading elements from left to right
		ListIterator lstItr= list.listIterator();
		while(lstItr.hasNext()) {
			System.out.print(lstItr.next()+" ");
		}
		System.out.println();
		// Reading elements from right to left
		while(lstItr.hasPrevious()) {
			System.out.print(lstItr.previous()+" ");
		}
		
		
	}

}
 */

/*
 * primitive data type - 8 types
 *  int, long , short , byte, boolean, char, float, double
 *  
 *  
 * Serialization/Collections/Synchronization
 * 
 * java.lang pkg provides all wrapper classes
 * 
 * int  - java.lang.Integer
 * long - java.lang.Long
 * double - java.lang.Double
 * short - java.lang.Short
 * byte - java.lang.Byte
 * boolean - java.lang.Boolean
 * char - java.lang.Character
 * float - java.lang.Float
 * 
 * convert primitive to Object
 *   - valueOf() - method 
 *   - Autoboxing - 1.5v
 *  
 * convert Object to primitive
 *   - xxxValue()
 *   - Autounboxing - 1.5v 
 *  
 * Converting Wrapper Obj to String
 *  - toString()
 * 
 * Converting String to Wrapper Obj
 *   - valueOf()
 * 
 * 
 *  Primitive to String 
 *	 - valueOf()
 *	
 *	String to primitive data types
 *	 -  parseInt(), parseDouble()
 */
/*
public class WrapperClassesDemo {

	public static void main(String[] args) {
		// converting Premitive to Object type
		int x =10; // premitive 
		Integer obj=Integer.valueOf(x);
		System.out.println(x);
		System.out.println(obj);
		
		System.out.println(obj.getClass().getName());
		
		Double doubleObj= Double.valueOf(10.023);
		System.out.println(doubleObj.getClass().getName());
		
		Float floatObj = Float.valueOf(10.23f);
		System.out.println(floatObj.getClass().getName());
		
		// Autoboxing
		Integer i = 100;
		System.out.println(i.getClass().getName());
		
		Boolean b = true;
		System.out.println(b.getClass().getName());
		
		// convert Obj to premitive
		int priInt= i.intValue();
		double priDouble = doubleObj.doubleValue();
		boolean priBool= b.booleanValue();
		
		
		// Autounboxing
		int i1 = i;
		boolean b1 = b; 
		double d1 = doubleObj;
		
		
		// Converting Wrapper Obj to String - toString()
		String str1 = i.toString();
		String str2	= doubleObj.toString();
		
		System.out.println(str1.getClass().getName());
		System.out.println(str2.getClass().getName());
		
		System.out.println(str1.equals(str2));
		System.out.println(str1+" | "+str2);

		
		// Converting String to Wrapper Obj - valueOf()
		String str3= "20.34f";
		System.out.println(str3.getClass().getName());
		Float flObj= Float.valueOf(str3);
		System.out.println(flObj.getClass().getName());
		
		// Primitive to String - valueOf
		
		int z = 90;
		String str4 = String.valueOf(z);
		System.out.println(str4.getClass().getName());
		
		
		//String to primitive data types - parseInt, parseDouble, parseFloat
		String str5 = "30";
		int i5 = Integer.parseInt(str5);
		double d5 = Double.parseDouble("1000.2345");
		
		// Primitive to String - valueOf()
		// Primitive to Wrapper Object - valueOf()
		// String to Wrapper Obj - valueOf()
		
		
		// String to primitive data types - parseXXX()
		// Wrapper Obj to String - toString()
		// convert Obj to premitive - xxxValue()
		
		
	}

}
 *//*
map Demo
package day5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map(I) - is not part of Collection
 *   - if you want to store values in the form of key value pairs
 *   - duplicate keys are not allowed
 *   - duplicate values allowed
 *   - null keys allowed, only once
 *   - null values allowed 
 *   - insertion order preserved
 *   
 *   Map(I) - SortedMap(I)
 *              - TreeMap(C)
 *                  - insert entries in sorting order
 *          - HashMap(C)
 *              - Won't maintain insertion order
 *          - LinkedHashMap(C)
 *                  - Insertion order maintained 
 *          - HashTable(C) - legacy class(1.0v)
 *                         - Thread safe
 *                         - methods are synchronized
 *                         - doesn't allow null key & value
 *                         - performance low
 */
/*

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();
		HashMap<String, Integer> marks2 = new HashMap();

		// add data
		marks.put("Ram", 78);
		marks.put("Sam", 89);
		marks.put("Ravi", 90);
		marks.put("Ravi", 95); // duplicate keys won't allowed
		marks.put("Shiv", 89); // duplicate values allowed
		marks.put(null, null);
		marks.put(null, null); // Only one null key allowed
		marks.put("Krish", null); // duplicate null values allowed

		// read
		// Convert map into Set view
		Set<Entry<String, Integer>> entries = marks.entrySet();
		System.out.println(marks);
		System.out.println(entries);

		for (Entry<String, Integer> entry : entries) {
			System.out.print(entry + " ");
		}
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()); // return keys
			System.out.println(entry.getValue());// return values
		}

		System.out.println();
		Iterator itr = entries.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// LinkedHashMap
		Map<String, Integer> marks3 = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> marks4 = new LinkedHashMap();

		marks3.put("Ram", 78);
		marks3.put("Sam", 89);
		marks3.put("Ravi", 90);
		marks3.put("Ravi", 95); // duplicate keys won't allowed
		marks3.put("Shiv", 89); // duplicate values allowed
		marks3.put(null, null);
		marks3.put(null, null); // Only one null key allowed
		marks3.put("Krish", null); // duplicate null values allowed

		System.out.println();
		// Map to Set view
		Set<Entry<String, Integer>> entries2 = marks3.entrySet();
		Iterator itr2 = entries2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next()); // insertion order maintains
		}

		// TreeMap
		Map<String, Integer> marks5 = new TreeMap<>();
		TreeMap<String, Integer> marks6 = new TreeMap();

		marks5.put("Ram", 78);
		marks5.put("Sam", 89);
		marks5.put("Ravi", 90);
		marks5.put("Ravi", 95); // duplicate keys won't allowed
		marks5.put("Shiv", 89); // duplicate values allowed
		// marks5.put(null, null);
		// marks5.put(null, null); // null keys are not allowed
		marks5.put("Krish", null); // duplicate null values allowed
		marks5.put("arjun", null);

		System.out.println();
		System.out.println("TreeMap: ");
		// Map to Set view
		Set<Entry<String, Integer>> entries3 = marks5.entrySet();
		Iterator itr3 = entries3.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next()); // insertion order wont maintains
		}

		// HashTable
		Map<String, Integer> marks7 = new Hashtable<>();
		Hashtable<String, Integer> marks8 = new Hashtable();

		marks7.put("Ram", 78);
		marks7.put("Sam", 89);
		marks7.put("Ravi", 90);
		marks7.put("Ravi", 95); // duplicate keys won't allowed
		marks7.put("Shiv", 89); // duplicate values allowed
		//marks7.put(null, null);
		//marks7.put(null, null); // null keys are not allowed
		//marks7.put("Krish", null); // null values are not allowed
		//marks7.put("arjun", null); // null values are not allowed

		System.out.println();
		System.out.println("HashTable: ");
		// Map to Set view
		Set<Entry<String, Integer>> entries4 = marks7.entrySet();
		Iterator itr4 = entries4.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next()); // insertion order wont maintains
		}
		
		// remove
		System.out.println();
		System.out.println(marks7);
		marks7.remove("Ram");
		System.out.println(marks7);
		
		// Read
		System.out.println(marks7.get("Shiv"));
		
		// Read all values
		System.out.println(marks7.values());
		
		// Read all keys
		// keySet returns Set view of Keys
		Set<String> keys= marks7.keySet();
		System.out.println(keys);
	}

}*/