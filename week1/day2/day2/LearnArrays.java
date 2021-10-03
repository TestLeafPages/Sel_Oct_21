package week1.day2;

import java.util.Arrays;

//import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// Array Initialisation
		int[] numArr = { 12, 221, 10, 133, 14, 105, 16 };
		
		// size of the array/ number of elements
		// length - property
		int length = numArr.length;
		System.out.println(" length of the array:" + length);
		
		// how to access the elemnt of an array - Index
		System.out.println(numArr[2]);
		
		// last element
		System.out.println(numArr[length-1]);
		System.out.println(numArr[length-2]);
		// first elemnt
		System.out.println(numArr[0]);
		
		// to print all the elemnts of an array
		System.out.println(" For loop");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		// System.out.println(numArr[length]);
		// numArr[length] = numArr[7]
		// ArrayIndexOutOfBoundsException
		
		// sorting
		Arrays.sort(numArr);
		System.out.println(" Sorted Output");
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		

		
		
		
		
		
		
		
		
		


	}

}
