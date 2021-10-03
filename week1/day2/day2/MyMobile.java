package week1.day2;

public class MyMobile {

	// variables/State
	// Instance variables
	// Can be accessed all through the classes globally using the objects(instance)
	
	// Local variable:
	// Restricted to that method alone
	
	String objectCategory = " Mobile Phone";
	float size; // declaration; initilization
	String shape;
	String IMEI;
	char brandName;
	int resolution;
	private byte weight;
	protected boolean isTouchScreen;
	short costMobile;

	// Methods/Behaviour
    // Syntax/ Signature
	// Access Modifier/Specifier    returnType   methodName ()-arguments { method body}
	// Access Modifer:
	// Public: 
	// Private: 
	// Protected:  Inheritence
	// default/package: 
	
	public void makeCalls() {
		// Local variables
		// cannot be accesesd thr objects
		int value =23;
		System.out.println(" Making calls");
	}
	
	public void viewGallery() {
		int value =23;
		System.out.println(" Vieiwing the gallery");
	}

	private void payBills() {
		System.out.println(" Paying Bills");
	}

	// To make use of the memebers of class
	// Step 1: main() method
	// Step 2: Create an object/ Instantiating
	// Memory is allocated only when an object is created
	// Menory allocation is not done when a class is created
	//
	public static void main(String[] args) {

		// <className> <objectname> =new className();
		// Members of a class can be accesses only through objects

		MyMobile samsung = new MyMobile();
		
		samsung.brandName = 'S';
		samsung.costMobile = 30000;
		samsung.IMEI = "239293-09-9Iopp";
		
		samsung.makeCalls();
		samsung.viewGallery();
		samsung.payBills();
		
		System.out.println(" samsung Brand:" + samsung.brandName);
		System.out.println(" samsung Csot:" + samsung.costMobile);

	

	}

}
