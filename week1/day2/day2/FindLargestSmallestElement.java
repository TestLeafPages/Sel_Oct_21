package week1.day2;

import java.util.Arrays;

public class FindLargestSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialise the array
		int arr[] = {100,49,398,34,1,267};
		// Get the length
		int length = arr.length;
		// Display the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// sort the array
		Arrays.sort(arr);
		// Display the aarray
		System.out.println(" Sorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// Choose the second largest number using the appropriate index
		System.out.println(" The second largest elemnt:" + arr[length-2]);
		// Choose the second smallest number
		System.out.println(" The second smallest elemnt:" + arr[1]);
	}

}
