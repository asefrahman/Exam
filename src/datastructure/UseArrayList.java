package datastructure;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<String> cities = new ArrayList<String>();
		cities.add("Dhaka");
		cities.add("New York");
		cities.add("London");
		cities.add("Dubai");

		System.out.println("After using add:" + cities);
		
		cities.remove(3);
		System.out.println("After removing 4th index: " + cities);


		System.out.println("Using for each loop:");
		for(String string: cities){
			System.out.println(string);
		}

		Iterator<String> itr = cities.iterator();
		System.out.println("Using while loop and interator to retrieve data:");
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}


	}
}