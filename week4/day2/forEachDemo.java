package week4.day2;

public class forEachDemo {

	public static void main(String[] args) {
		
		int arr[] = {3,4,5,6,7,8};
		
	
		for (int eachInt : arr) {
			System.out.println(eachInt);
		}
		
		String str[] = {"Hi", "Hello"};
		
		for (String eachString : str) {
			System.out.println(eachString);
		}
		// difference between for and for each
		// for each loop
		// no index 
		// traverse only in one forward direction
		

	}

}
