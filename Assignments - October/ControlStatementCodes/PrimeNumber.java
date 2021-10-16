package javabasiccodes;


public class PrimeNumber{
	
	public static void main(String[] args) {
		
		/*
		 * Prime number--> divisible by the number itself and by 1 the number has only 2
		 * factors
		 * 
		 * 5---1 and 5-->2 factors-->prime number 6 --2 3 6--> 3 factors-->not a prime
		 * number5--->1,5
		 */
		
		  int input = 100; 
		  int count=0;
		  
		  
		  for (int i=1;i<=input/2;i++)
		  { if (input % i==0)
			  count= count+1;
		  }
		  
		  if(count==2) {
			  System.out.println(input+ "is a prime number"); 
			  }else
		  System.out.println(input+ "is not a prime number");
		  
		  
		  
		 	
		
		
		
	           
	          
		
		
		}

}
  