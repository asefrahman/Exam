package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> SocialMedia = new ArrayList<String>();
		SocialMedia.add("Facebook");
		SocialMedia.add("Instagram");


		List<String> Media = new ArrayList<String>();
		Media.add("HuffingtonPost");
		Media.add("NY Times");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("Social Media", SocialMedia);
		map.put("NY Times", Media);


		for (Iterator it1 = map.entrySet().iterator(); it1.hasNext(); ) {
			System.out.print(it1.next() + " ");

		}
		System.out.println();


		Iterator it2 = map.entrySet().iterator();
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}




	}
	}


