package javabasiccodes;

public class Factorial {

public static void main(String[] args) {
			
			//  analyse the problem statement
			//  5!  = 1*2*3*4*5
			//      = (2)*3*4*5
			//      = (6)*4*5
			//      = 24*5
			//      = 120
			
			int num = 5;
			int fact = 1;
			
			// initialization
			// condition
			// iteration
			// i++ => i=i+1
		for (int i = 1; i <=num; i++) {
			
			fact = fact * i;
		//	System.out.println("factorial:"+ fact);
			// i=1 =>  1 <= 4  fact = 1* 1 = 1  i=> 2   syso
			// i=2 =>  2 <= 4  fact = 1* 2 = 2  i=> 3   syso
			// i=3 =>  3 <= 4  fact = 2* 3 = 6  i=> 4
			// i=4 =>  4 <= 4  fact = 6* 4 = 24 i=> 5
			// i=5 =>  5 <= 4  Come out of the for loop
		}
		
		System.out.println("factorial:"+ fact);

	}

}
