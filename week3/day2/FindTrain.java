package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTrain {

	public static void main(String[] args) {
		
		// Train Names -> 5 different names with one of them as duplicate
		// Sort the names and 
		// Print the last but one -> train name 
		
		List<String> trainNames = 
				Arrays.asList("Bangalore Express",
							  "Chennai Express",
							  "Delhi Express",
							  "Chennai Express",
							  "Kolkotta Express");
		
		Collections.sort(trainNames);
		System.out.println(trainNames.get(trainNames.size()-2));
		
		

	}

}
