package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
	
	public static void main(String[] args) {
		int[] data1 = {2,4,5,6,8,11,12,14,18,24,32}; // 
		int[] data2 = {1,4,7,9,6};
		// 4, 6
		
		/*
		for (int i = 0; i < data1.length; i++) { // 200000
			for (int j = 0; j < data2.length; j++) { // 5000 
				if(data1[i] == data2[j]) { // 200000 * 5000 
					System.out.println("Intersecting data "+data1[i]);
				}
				
			}
			
		} */
		
		Set<Integer> dups = new HashSet<Integer>();
		for (int i = 0; i < data2.length; i++) { // 5000
			dups.add(data2[i]);
		}
		
		for (int i = 0; i < data1.length; i++) { // 200000
			if(dups.contains(data1[i])) {
				System.out.println("Intersecting data "+data1[i]);
			}
		}
		
		// Hint -> Unique / remove duplicates 
		
		
		
		
	}

}
