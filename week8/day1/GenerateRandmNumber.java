package week8.day1;

import java.util.Date;

public class GenerateRandmNumber {

	public static void main(String[] args) {
		/*
		 * int ranNum= (int) (Math.random()*999999+999999); System.out.println(ranNum);
		 */
		
		Date date = new Date();
		System.out.println(date);
		String strDate = date.toString();
		String newDate = strDate.replaceAll(":", "_");
		System.out.println(newDate);
	}

}
