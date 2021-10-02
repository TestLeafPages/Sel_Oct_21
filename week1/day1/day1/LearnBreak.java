package week1.day1;

public class LearnBreak {
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		
		System.out.println(" Out of for loop");
	}
}
