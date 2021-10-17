package week3.day2;

/*
 * Abstract class -> implementation + abstract !!
 * Java : AbstractList (A) -> ArrayList (C)
 * Selenium: By (A) -> ById (C)
 */

public abstract class FindPrices implements PetrolPrice {

	public float getOriginalPrice() {
		return 44.02f;
	}

	public float getCgTaxes() {
		return 35.5f;
	}
	
	public void run() {
		System.out.println("Central run");
	}

	/*
	 * extends can be used in either class, interface, enum, annotation
	 * extends always do with same type
	 * class -> class
	 * interface -> interface
	 * enum -> enum
	 * 
	 */

}
