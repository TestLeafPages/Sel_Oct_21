package stringhandling;

public class SumOfDigitsFromString {

	

	public int sumMthd2() {
		String text = "Tes12Le79f65";
		int sum = 0;
		char[] ch = text.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isDigit(ch[i])) {
				int numCh = Character.getNumericValue(ch[i]);
				sum = sum + numCh;
			}
		} 
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfDigitsFromString obj = new SumOfDigitsFromString();
		int sum = obj.sumMthd2();
		System.out.println(" Sum of all the digits of the string :"+ sum);
	}
	

} 
 