package week3.day2;

public class TnPetrolPrice extends FindPrices{

	public float getSgTaxes() {
		return (float) ((getCgTaxes()+getOriginalPrice())*0.3);
	}

	public float setFinalPrice() {
		return getOriginalPrice()+ getCgTaxes()+ getSgTaxes();
	}
	
	public void run() {
		this.setFinalPrice();
		System.out.println("TN run");
	}
}
/*
 super -> keyword -> refers to the superclass object
*/