package week1.day2;

public class LearnMethod {
	// Getting the values from the method
	public int add() {
		int a = 10;
		int b = 20;
		int c = a+b;
	//	System.out.println(c);
		return c;
	}
	// passing the arguments
	public void getResult(int value, String str) {
		System.out.println(" The accepted argument is : " + value);
		System.out.println(" string value:" + str);
	}
	public static void main(String[] args) {
		LearnMethod obj = new LearnMethod();
		// ctrl 2 , press l
		int result = obj.add();
		System.out.println(" Result:" + result);
	     obj.getResult(result, "String");
	     obj.getResult(45, "str");
	}	
}
