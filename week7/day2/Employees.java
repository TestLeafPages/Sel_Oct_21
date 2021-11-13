package week7.day2;

public class Employees {

	int empId;
	String empName;
	boolean empStatus;

	Employees() {
		this(100,"Hari",true);
		System.out.println("Default Constructor");
	}
	
	Employees(int id, String name, boolean status){
	//	this(); // Call default constructor
		System.out.println("Parameterized Constructor");
		empId = id;
		empName = name;
		empStatus = status;
		
		
	}
	
	

	public static void main(String[] args) {

		Employees emp = new Employees();

		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.empStatus);

	}

}
