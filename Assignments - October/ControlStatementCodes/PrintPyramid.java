package javabasiccodes;

public class PrintPyramid {

	public static void main(String[] args) {
		
		//number of lines =5
		//
		//space before every star n-line no.(can be taken as i)n-i
		//stars to be printed in each line 2*i-1
		
	int n=5;
	for(int i=1;i<=n;i++)//i=1,n=5
	{//for giving space
		for(int space=1;space<=n-i;space++)//space<=n-i==>space=n-1==>4
		{
			System.out.print(" ");// for i=1 , 4 spaces will be entered
		}
	//after giving space in 1st line print the need star in the first line -means here 1
		for(int star=1;star<=(2*i)-1;star++)//star=1,star<=2*1-1=1 star
		{//star=2==>2*2=4-1=3...
			System.out.print("*");
		}
		System.out.println();//this will take you next line 
	}
	}

}
