package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> planets = new LinkedList<>();

		planets.add("Jupiter");
		planets.add("Earth");
		planets.add("Saturn");

		System.out.println("Before remove:"+planets);
		System.out.println("pop:"+planets.remove("Saturn"));
		System.out.println("After remove:"+planets);
		System.out.println("peek:"+planets.peek());
		System.out.println("After peek:"+planets);

		System.out.println("Using iterator:");
		Iterator<String> list=planets.iterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		System.out.println("using a for loop with an iterator:");
		for(Iterator p1 = planets.iterator(); p1.hasNext();){
			System.out.print(p1.next()+" ");
		}

	}

	}
