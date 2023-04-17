/**
 * 
 */
package question15;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Sobhareddy Pittu Apr 16, 2023
 */
public class Question15 {
	public static void main(String args[]) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Bandi", "Java");
		ht.put("James", "ios");
		ht.put("Prashanth", "GDP");

		// Creating a HashMap to store the same data
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Bandi", "Patterns");
		hm.put("James", "ios");
		hm.put("Prashanth", "GDP");

		// Retrieving data from Hashtable
		System.out.println("Professor in Hashtable:");
		for (String director : ht.keySet()) {
			System.out.println(director + ": " + ht.get(director));
		}

		// Retrieving data from HashMap
		System.out.println("Professor in HashMap:");
		for (String director : hm.keySet()) {
			System.out.println(director + ": " + hm.get(director));
		}

		// Trying to add null key to Hashtable
		try {
			ht.put(null, "");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: " + e.getMessage());
		}

		// Adding null key to HashMap
		hm.put(null, "");
		System.out.println("Adding null key to HashMap: " + hm.get(null));
	}

}
