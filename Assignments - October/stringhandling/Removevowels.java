package stringhandling;

public class Removevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "testleaf";
		char[] chars = str.toCharArray();
	
		     String replaceAll = str.replaceAll("[aeiou]", "");
		     System.out.println(replaceAll);

	}

}
