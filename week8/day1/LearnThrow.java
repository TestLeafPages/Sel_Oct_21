package week8.day1;

public class LearnThrow {

	public static void division(int num1, int num2) {
		if(num1 < num2) {
			throw new ArithmeticException("Invalid input: num1 is smaller");
		}else {
			System.out.println(num1/num2);
		}
		

	}
	
	public static void main(String[] args) {
		division(10,5); //first num < second num

	}

}
