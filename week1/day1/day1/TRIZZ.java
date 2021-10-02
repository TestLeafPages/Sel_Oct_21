package week1.day1;

public class TRIZZ {
	public static void main(String[] args) {

		int number = 15;

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("Divisible both by 3 and 5");
		} else if (number % 5 == 0) {
			System.out.println(" Divisible by 5");
		} else if (number % 3 == 0) {
			System.out.println(" Divisible  by 3");
		}else
			System.out.println(" Neither divisible by 3 nor by 5");
	}

}
