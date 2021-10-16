package javabasiccodes;

public class Armstrongno {
	// sum of cube of each digit gives the same
	// input-->153-->1^3+5^3+3^3

	public static void main(String[] args) {
		int number = 53;
		int calculate = 0;
		int remainder, original;

		original = number;
		while (number > 0) {
			remainder = number % 10;
			calculate = calculate + (remainder * remainder * remainder);
			number = number / 10;
		}

		if (original == calculate) {
			System.out.println("Its an Armstrong Number");
		} else {
			System.out.println("Its not an Armstrong number");

		}

	}
}


