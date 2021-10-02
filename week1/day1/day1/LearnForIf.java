package week1.day1;

public class LearnForIf {
// print even numbers from 0 to 50
	public static void main(String[] args) {
		
		for (int i = 0; i <= 50; i++) {
			if (i%2 == 0) {
				System.out.println( i + " is an even number");
			}
		}
		
	// continue statement	- skip ( skip all the odd numbers)
		
	for (int i = 0; i <= 50; i++) {
			
			if (i%2 != 0) {
				continue;
			}
			System.out.println( i );
		}
		
	}
}

