package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class CountCharOccurances {
	
	public static void main(String[] args) {
		
		String companyName = "amazon india development center";
		
		// Print how many characters and its each count 
		// a -> 3
		// m -> 2
		
		// Map -> Character , Integer
		// Does the return order matters -> Yes, alphabetic !! -> TreeMap
		/*
		 * String -> characters -> toCharArray
		 * 
		 * Loop through every character -> check if the character in the map
		 * 		-> No -> Create a new entry -> character, 1
		 * 		-> Yes -> Update that count -> existing count + 1
		 * 
		 * Finally print
		 * 
		 */
		
		/*
		char[] charArray = companyName.toCharArray(); 
		Map<Character , Integer> map = new HashMap<Character , Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i]))
				map.put(charArray[i], map.get(charArray[i])+1);
			else
				map.put(charArray[i], 1);
		}
		System.out.println(map);*/
		
		char[] charArray = companyName.toCharArray(); 
		Map<Character , Integer> map = new HashMap<Character , Integer>();
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
		}
		System.out.println(map);
		
		
		
		/*char[] charArray = companyName.toCharArray();
		int count = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'a') {
				count++;
			}
		}
		System.out.println(count);*/
		
	}

}
