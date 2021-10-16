package week3.day1;

public class Calculator {

	public void add(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}

	public void add(int x, double y) {
		double sum = x + y;
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(2, 3.023848);
		obj.add(2, 3, 4);
	}

}
