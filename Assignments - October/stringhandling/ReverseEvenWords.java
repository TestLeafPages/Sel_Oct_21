package stringhandling;

public class ReverseEvenWords {

	// sentence, word, letter
	// I-want-to-be-software-tester-always
	// 7 words
	// reverse the even words - 0, 2, 4, 6
	// split("")
	
	
	// 1. split the sentence into different words
	 //  split() - words
	// 2. choose the even words alone
	// 3. reverse the even words
	
	
	public void reverse() {
		String test = "I want to be software tester always";
		String[] word = test.split("\\s");
		
		for (int i = 0; i < word.length; i++) {
			if ((i % 2) == 0) {
		//		System.out.println(word[i]);
				char[] charArray = word[i].toCharArray();
				
				for (int j = charArray.length - 1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			} 
			else {
				System.out.print(word[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		ReverseEvenWords rev = new ReverseEvenWords();
		rev.reverse();
	}
}
