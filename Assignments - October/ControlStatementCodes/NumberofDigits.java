package javabasiccodes;

public class NumberofDigits {

	public static void main(String[] args) {
		int input = 78935;
				int count = 0;
		while (input != 0) {
			input = input / 10;
			count++;
		}
		System.out.println("The number of digits in the given number : " + count);
	}

}
