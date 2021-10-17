package week3.day2;

public class BuyPetrol {

	public static void main(String[] args) {
		
		// You cannot create object for interface or abstract class
		TnPetrolPrice buy = new TnPetrolPrice();
		float setFinalPrice = buy.setFinalPrice();
		System.out.println(setFinalPrice);
		buy.run();
		
		PdPetrolPrice buy1 = new PdPetrolPrice();
		float setFinalPrice1 = buy1.setFinalPrice();
		System.out.println(setFinalPrice1);

	}

}
