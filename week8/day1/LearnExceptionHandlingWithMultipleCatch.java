package week8.day1;

public class LearnExceptionHandlingWithMultipleCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		int[] nums = { 10, 20, 30 };

		try {
			System.out.println(x / y);
			try {
				System.out.println(nums[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}catch (Exception e) {
				System.out.println(e);
			}
		} catch (ArithmeticException e) {
			if (y == 0) {
				System.out.println(x / 1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("End of the program");

	}

}
