package week1.day1;

public class LearnContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue; // skip
			}
			System.out.println(i);
		}
		
		System.out.println(" Out of for loop");
		

	}

}
