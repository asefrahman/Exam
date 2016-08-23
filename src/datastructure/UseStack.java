package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> planets = new Stack<>();
		planets.add("Jupiter");
		planets.add("Earth");
		planets.add("Saturn");

		System.out.println("Before pop:"+planets);
		System.out.println("pop:"+planets.pop());
		System.out.println("After pop:"+planets);
		System.out.println("peek:"+planets.peek());
		System.out.println("After peek:"+planets);

		System.out.println("Using iterator:");
		Iterator<String> list=planets.iterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		System.out.println("Using a for loop with an iterator:");
		for(Iterator p1 = planets.iterator(); p1.hasNext();){
			System.out.print(p1.next()+" ");
		}

	}
	}

