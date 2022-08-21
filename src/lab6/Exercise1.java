package lab6;
import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
	/*Create a method which accepts a hash map and return the values of the map in 
sorted order as a List.*/
	
	ArrayList<Integer> getValues(HashMap<Integer, Integer> map) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer>  i: map.entrySet()) {
			list.add(i.getValue());
		}
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
		//Creating HashMap
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		//adding data
		map.put(1,10);
		map.put(2,20);    
		map.put(3,30);   
		map.put(4,15);
		Exercise1 ex1 = new Exercise1();
		ArrayList<Integer> a1 = ex1.getValues(map);
		System.out.println(a1);
	}
}

