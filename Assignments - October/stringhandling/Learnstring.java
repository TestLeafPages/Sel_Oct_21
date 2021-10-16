package stringhandling;

public class Learnstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LearnSplit.variable);
		
		String test = "Happy Days Ever-for us";
		
		
		int len = test.length();
		System.out.println("Length :"+len);
		int position = test.indexOf('s'); // first occurence
		System.out.println("position:"+position );
		int lastInd = test.lastIndexOf('s');
		System.out.println("lastInd:"+lastInd);
		char ch = test.charAt(10);
		System.out.println(" ch:"+ ch);
		
		
		char[] chArr=test.toCharArray();
		
		
		System.out.println(" Char Array");
		for (int i = 0; i < chArr.length; i++) {
			System.out.println("chArr["+i+"]: " + chArr[i]);
		}
				
		System.out.println(test.substring(6));
		// print the sbstr from the 6th position till the end
		System.out.println(test.substring(6,12));
		// includes the start index, excludes the end index
		// prints the chars from 6th to 11th index 
		String[] splitStr = test.split("-");
		
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println(splitStr[i]);
		}
		System.out.println("SPLIT STR");
		//System.out.println(splitStr[2]);
		
		System.out.println("***********************************");
		int a=4;
		int b=5;
		String c ="109";
		
		System.out.println("a+b" + (a+b));
		System.out.println("b+c:"+ (b+c));
		
		System.out.println("************************");
		int value = Integer.parseInt(c);
		System.out.println("Parse Value:"+ value);
		System.out.println("b+c:"+ (b+value));
		
		
		
		
		// + act as addition for similar data types
		// + acts as a concatenator fpr diff data types
		
		
	}
}
