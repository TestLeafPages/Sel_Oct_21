package week3.day2;

public interface PetrolPrice {
	
	/*
	 * Petrol -> 37.02 Rs
	 * Central -> 32.00 Rs 
	 * Bunk -> 3.5 Rs
	 * State Govt -> 30% 
	 * 
	 */
	
	public float getOriginalPrice();
	
	public float getSgTaxes();
	
	public float getCgTaxes();
	
	public float setFinalPrice();
	
}
