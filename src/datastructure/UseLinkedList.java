package datastructure;

import java.util.*;
import java.util.LinkedList;
import java.util.Iterator;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> iPhones = new LinkedList<String>();
		iPhones.add("iPhone 6");
		iPhones.add("iPhone 6s");
		iPhones.add("iPhone se");

		System.out.println("After using add:" + iPhones);

		System.out.println("Head of the list:"+ iPhones.peek());
		System.out.println("First member of the list:"+ iPhones.peekFirst());
		System.out.println("Last member of the list:"+ iPhones.peekLast());

		iPhones.remove("iPhone se");
		System.out.println("After removing 'iPhone se': " + iPhones);

		Iterator<String> itr = iPhones.listIterator();
		System.out.println("Using while and iterator:");
		while(itr.hasNext()){
			System.out.println(itr.next());

		}
		System.out.println();
		System.out.println("Using for each loop:");
		for (Iterator list2 = iPhones.iterator(); list2.hasNext(); ) {
			System.out.println(list2.next() + " ");
		}


	}

}
