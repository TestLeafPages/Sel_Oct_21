package week1.day2;

public class MyKids {

	public static void main(String[] args) {
		
		MyMobile myObj = new MyMobile();
		System.out.println("Brand name: " + myObj.brandName);
		System.out.println(myObj.isTouchScreen);
		
		myObj.makeCalls();
		myObj.viewGallery();
		//myObj.payBills();
	}
}
