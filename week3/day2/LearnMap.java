package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {
	
	/*
	 * Map
	 * 
	 * 	- Interface
	 *  - Implementation classes: HashMap, TreeMap, LinkedHashMap
	 * 		 - HashMap (Hashing Algorithm) -> Random Order
	 * 		 - TreeMap (ASCII Order)
	 *  	 - LinkedHashMap (Insertion Order)
	 *  - 2 Dimensional (Key, Value)
	 *  	 - Key is always unique 
	 *  	 - Value can be duplicate
	 * 
	 * 	- Examples: PNR (Unique) and Status (Can be duplicate)
	 * 			  : Car (Phone) and Type (Car Number / Can be duplicate)
	 * 			  : Book (ISBN) and Price (Can be duplicate)
	 * 
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> mentors = new HashMap<Integer, String>();
		mentors.put(2000120, "Dhivya");
		mentors.put(2000101, "Hari");
		mentors.put(2000102, "Sheribha");
		mentors.put(2000121, "Dhivya");
		mentors.put(2000122, "Vidya");
		mentors.put(2000120, "Babu"); // If the key is same -> value will get updated 

		//System.out.println(mentors);
		
		mentors.remove(2000120);
		System.out.println(mentors.size());
		
		// Entry -> Combination of key and value !! 
		
		/*
		 * for iterator 	-> loops based on index
		 * for each loop 	-> loops based on the value
		 * 
		 */
		// mentors.entrySet(); -> every entry available inside the map
		
		for (Entry<Integer, String> each : mentors.entrySet()) {
			System.out.println(each.getValue());
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
