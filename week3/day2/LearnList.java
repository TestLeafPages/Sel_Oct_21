package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;

public class LearnList {
	
	/*
	 * Arrays -> 10 data (int) -> static 
	 * int[] nums = new int[];
	 * Dynamic arrays -> grow or shrink !! 
	 * 
	 * List 
	 * 	- Interface
	 * 	- Implemented using several classes like ArrayList, LinkedList
	 * 	- Single Dimensional data structure
	 * 	- Allows Duplicate data to be stored
	 *  - Order is maintained in the order of insertion
	 * 	- Highly used Methods:
	 * 			- add : to add element to the list (at the end)
	 * 			- remove
	 * 			- get
	 * 			- size
	 * 			- contains
	 * 	- How to sort a list? Collections.sort(lst)
	 */

	public static void main(String[] args) {
		// <Generics> --> Type of collection is !
		// List -> imported java.util
		// List (I) implemented by AbstractList (A) and extended by ArrayList (C)
		List<String> mentorsList = new ArrayList<String>();
		//mentorsList.add(null);
		mentorsList.add("Hari");
		mentorsList.add("Sheribha");
		mentorsList.add("Dhivya");
		mentorsList.add("Dhivya");
		mentorsList.add("Vidhya");
		mentorsList.add(0, "Babu"); // Overloading 
		System.out.println(mentorsList.size());
		mentorsList.remove("Dhivya");
		System.out.println(mentorsList.contains("Babu"));
		System.out.println(mentorsList);
		
		// Class -> Collections
		Collections.sort(mentorsList);

		System.out.println("******After Sorting");
		System.out.println(mentorsList);

		Collections.reverse(mentorsList);		

		System.out.println("******After Reversing");
		System.out.println(mentorsList);
		
		// Who is the first mentor
		System.out.println(mentorsList.get(0));
		
		// Who is the last mentor
		int size = mentorsList.size();
		System.out.println(mentorsList.get(size-1));

		// In Selenium, where do we use ArrayList -> findElements 
		
	
		
		
		
		
		
		
		
		

	}

}
