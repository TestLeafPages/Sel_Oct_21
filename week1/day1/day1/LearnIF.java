package week1.day1;

public class LearnIF {
	public static void main(String[] args) {
		boolean status = true;
		int number = 0;

		/*
		 * if (status == true) { System.out.println(" You get a break"); } else {
		 * System.out.println(" You will not have a break"); }
		 */

	/*	if (number > 0) {
			System.out.println(" the number is positive");
		} 
		else {
			System.out.println(" The number is negative");

		}*/
		
		
		if (number > 0) {
			System.out.println(" the number is positive");
		} 
		else if(number < 0){
			System.out.println(" The number is negative");
		}
		else
		    System.out.println(" It is a neutral number");
	}
}
