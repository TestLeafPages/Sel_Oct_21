package stringhandling;

public class RemoveduplicatesString {

	public static void main(String[] args) {
			int j;
			String text = "We learn java basics as part of Java sessions sessions in java week1";
			
		String[]words = text.split("\\s");
			for (int i = 0; i < words.length; i++) {
				for (j = i+1; j < words.length; j++) {
					if (words[i].equalsIgnoreCase(words[j])) {
						words[j] = "";
						
			        	}
					}
		    	}
			System.out.println("String without duplicates: ");
			for (int i = 0; i< words.length; i++) {
				System.out.print(words[i] +" " );
			}
	}

}
