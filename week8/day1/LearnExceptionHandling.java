package week8.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			if(y==0) {
				System.out.println(x/1);
			}
		}
		
		
		System.out.println("End of the program");
				
				

	}

}
