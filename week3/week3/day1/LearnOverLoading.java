package week3.day1;

public class LearnOverLoading {

	public void employeeInfo() {
		String name = "Dhivya";
		System.out.println(" Name:" + name);
	}
	
	public void employeeInfo(String name, int empID) {
		System.out.println(" Name:" + name);
		System.out.println(" Id: " + empID);
	}
	
	public void employeeInfo(int empID, String name) {
		System.out.println(" Name:" + name);
		System.out.println(" Id: " + empID);
	}
	
	public void employeeInfo(String name, int empID, int age) {
		System.out.println(" Name:" + name);
		System.out.println(" Id: " + empID);
		System.out.println(" Age : " + age);
	}
	
	public static void main(String[] args) {
		LearnOverLoading obj = new LearnOverLoading();
		
		obj.employeeInfo();
		obj.employeeInfo(200, "Aravind");
		obj.employeeInfo("Easwar", 201);
		obj.employeeInfo("Saheel", 202, 45);
		
		
	}

}
