package week1.day1;

public class LearnClassMthds {

	// variables/State
	String objectCategory = " Mobile Phone";
	float size; // declaration; initilization
	String shape;
	String IMEI;
	char brandName;
	int resolution;
	byte weight;
	boolean isTouchScreen;
	short costMobile;

	// Methods/Behaviour

	public void makeCalls() {
		System.out.println(" Making calls");
	}

	public void viewGallery() {
		System.out.println(" Vieiwing the gallery");
	}

	public void payBills() {
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

		LearnClassMthds samsung = new LearnClassMthds();
		samsung.brandName = 'S';
		samsung.costMobile = 30000;
		samsung.makeCalls();
		samsung.viewGallery();
		System.out.println(" samsung Brand:" + samsung.brandName);
		System.out.println(" samsung Csot:" + samsung.costMobile);

		LearnClassMthds apple = new LearnClassMthds();
		apple.brandName = 'A';
		apple.costMobile = 31000;
		apple.makeCalls();
		apple.viewGallery();
		System.out.println(" Apple Brand:" + apple.brandName);
		System.out.println(" Apple Csot:" + apple.costMobile);

	}

}
