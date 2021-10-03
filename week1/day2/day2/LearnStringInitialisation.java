package week1.day2;

public class LearnStringInitialisation {

	public static void main(String[] args) {
		// object is created for your string

		// Literals( data)
		String strTest1 = "Welcome to testleaf";
		// new operator
		// new memory is allocated and stored

		String strTest = "Welcome to testleaf";

		// 1. String Length: method
		int lengthStr = strTest.length();
		System.out.println(" Length : " + lengthStr);

		// 2. Find a character in a String:( give position)
		System.out.println(strTest.charAt(5));

		// 3. Get the position of a character in the string:( first occurence)
		int indexOf = strTest.indexOf('e');
		System.out.println(" Index :" + indexOf);

		// 4. Get the last position of a character in the string:
		int lastIndexOf = strTest.lastIndexOf('e');
		System.out.println(" Last Index:" + lastIndexOf);

		// 5.Convert a string to a character array:
		System.out.println(" Complte string is :" + strTest);
		// Welcome to testleaf
		char[] charArray = strTest.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray[" + i + "]: " + charArray[i]);
		}

		// 6. Convert a string to words:
		// Welcome-to-testleaf
		String[] split = strTest.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println("split[" + i + "]: " + split[i]);
		}

		// 7. Get a part of the string:
		String substring = strTest.substring(8);
		System.out.println(" SubString:" + substring);
		// start index : inclusive
		// end Index : exclusive
		String substring2 = strTest.substring(8, 12);
		System.out.println(" SubString 2:" + substring2);

		// 8. Replace a character:
		String replace = strTest.replace('e', 'E');
		System.out.println(" Repalced string:" + replace);

		// 9. Replace all the integers, non integers:
		String str1 = "TestLeaf-102839";
		// d - Integers
		// D - Non Integers

		String replaceAll = str1.replaceAll("[\\D]", ""); // - Replace all the non integers by null(all except numbers)
		String replaceAll2 = str1.replaceAll("[\\d]", ""); // - Replace all the integers by null
		System.out.println(replaceAll);
		System.out.println(replaceAll2);
		
		// 10. Compare two strings:
		
		String str3 = "TestLeaf";
		String str2 = "TestLeaf";
		
		String strNew = new String("amma");
		String strNew1 = new String("amma");
		
		// same memory locn
		
		if(str3.equals(str2)) {
			System.out.println(" equal content");
		}
		else
			System.out.println(" not eqaul");
		
		
		if(strNew==strNew1) {
			System.out.println(" same locn");
		}
		else
			System.out.println(" diff locations");

	}

}
