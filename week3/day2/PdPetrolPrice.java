package week3.day2;

public class PdPetrolPrice extends FindPrices {

	public float getSgTaxes() {
		return (float) ((getCgTaxes()+getOriginalPrice())*0.285);

	}

	public float setFinalPrice() {
		return getOriginalPrice()+ getCgTaxes()+ getSgTaxes();
	}

}
