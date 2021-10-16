package stringhandling;

public class LearnSplit {
		
	public static int variable = 20;
	
	public static void main(String[] args) {
		String company = "Amazon Development Center";
		System.out.println(variable);
		// Center Develpoment Amazon
		// toCharArray()
		// split()
		
		System.out.println("String:" + company);
		char[] charArray = company.toCharArray();
	//	System.out.println(" Char Array");
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]); 
		}
		
		//System.out.println("Split");
		String[] splitArr = company.split(" ");
		
		  for (int i = 0; i < splitArr.length; i++) {
			  System.out.println(splitArr[i]);
		  }
		 
		 
		System.out.println(splitArr.length);
		// splitArr[0] = Amazon;
		// splitArr[1] = Development;
		// splitArr[2] = Center;
		// splitArr.length = 3
		for (int i = splitArr.length-1; i >=0 ; i--) {
			//  i=2; i<=0; i--
			//  i=0; i<3; i++
			System.out.println(" value of i:"+ i);
			System.out.println(splitArr[i]);
			
		}
	
	} 

}
