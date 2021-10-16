package stringhandling;

public class ConcatStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String txt= "Happy Day Ever";
 int a =10;
 int b=5;
 String c = "10";
  // + acts as an operator for similar data types
 // + acts as an concatenator for diff data types
 
 String concat = txt.concat(c);
 System.out.println(concat);
 
System.out.println(a+b);
System.out.println(a+c);

String str = "42 Buses";
String str1=str.replaceAll("[^0-9]", "");
//driver.findElement()
int num = 10;

//int result = str + num;


int strNum = Integer.parseInt(str1);
int result = strNum + num;
System.out.println(result);

	}

}
