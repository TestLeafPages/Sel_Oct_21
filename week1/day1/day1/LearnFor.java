package week1.day1;

import java.util.Iterator;

public class LearnFor {

	public static void main(String[] args) {

	/*	System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);*/

		// initialization; condition; iteration
		// start value ; 
		for (int i = 0; i < 3; i++) {
			// i++ --> i = i+1
			// i = 0; 0<3(true);   print 0; i = 1
			// i = 1; 1<3 (true);  print 1; i = 2
			// i = 2; 2<3 (true);  print 2; i = 3
			// i = 3; 3<3  (false); not execute- comes out of the for loop
			System.out.println(i);	
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hi");
		}
		
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		
		
		

	}

}
