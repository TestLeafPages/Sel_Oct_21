package stringhandling;

public class  CharOccurance  {
	// single bulk data
	// Try to break into sma ll chunks- characters
	
	public void mthd1() {
			String str = "Welcome to Chennai";
			int count = 0;
			
			char[] charArray = str.toCharArray();
			
			for (int i = 0; i < charArray.length; i++) {
				if(charArray[i]=='e') {
					count++;
					System.out.println("index of e is :"+ i);
				}
			}
			System.out.println("cont of e is :" + count);
		}
	
	public void mthd2() {
		String str = "Welcome to Chennai";
		
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			// str.charAt(0) - W
			// str.charAt(1) - e
			
			if(str.charAt(i)=='e') {
				count++;
			}
		}
		System.out.println("cont of e is :" + count);
	}
	
	 // count of e
	 // charArray
	
	
	public static void main(String[] args) {
		CharOccurance obj = new CharOccurance();
		obj.mthd1();
		obj.mthd2();
}
}
