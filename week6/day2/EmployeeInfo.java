package week6.day2;

public class EmployeeInfo {
	int empId;
	String empName;
	static String compName;
	
	static {
		System.out.println("static block");
	}

	public void setValues(int id, String name, String company) {
		empId = id;
		empName = name;
		compName = company;
	}
	
	public static void staticMethod() {
		System.out.println("static method");
	}
	

	public static void main(String[] args) {
		
		staticMethod();
		
		
		/*
		 * EmployeeInfo emp1 = new EmployeeInfo(); emp1.setValues(100, "Hari",
		 * "TestLeaf");
		 * 
		 * EmployeeInfo emp2 = new EmployeeInfo(); emp2.setValues(200, "Prasad",
		 * "TestLeaf Software Solutions");
		 * 
		 * System.out.println(emp1.empId + " " + emp1.empName + " " + compName);
		 * System.out.println(emp2.empId + " " + emp2.empName + " " + compName);
		 */
	}

}
