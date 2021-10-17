package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {
	
	/*
	 * 10, 24, 32, 64, 85, 37, 12 , 10
	 * 
	 * If the given numbers have any duplicate !! -> No duplicates !!
	 * Which numbers are duplicated !
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		int[] nums = {10, 24, 32, 64, 85, 37, 12 , 10,24};
		boolean bDuplicates = false;
		Set<Integer> unique = new LinkedHashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(unique.add(nums[i]) == false) {
				System.out.println("Duplicate value is "+nums[i]);
				bDuplicates = true;
				//break;
			}
		}
		if(!bDuplicates)
			System.out.println("All values are unique");
		
	}

}
