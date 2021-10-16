package javabasiccodes;

public class Fibanocciseries {

	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

				// 5 Print first number   0+1+1+2+3+4
				
				// Iterate from 1 to the range
				
				// add first and second number assign to sum

				// Assign second number to the first number

				// Assign sum to the second number
				
				// print sum  step 1: 0+1= 1,  Step:2 1+1=2,
		
		int sum = 0;
		int firstNum = 0;
		int secNum = 1;
	//	System.out.println(firstNum);
	//	System.out.println(secNum);

		for (int i = 1; i < 8; i++) {
			// System.out.println(firstNum);
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
		}

	}

}
