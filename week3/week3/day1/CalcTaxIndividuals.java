package week3.day1;

// Implemenation class
public class CalcTaxIndividuals implements TaxCalculation, IncomeCalculation{

	// from the interface
	public void calcDeductions(String name, double HRA, double LTA) {
		System.out.println(" calcDeductions-Individulas" );
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println(" calcGrossIncome - Individulas");
	}
	
	// own methods of that class
	
	public void taxSlab() {
		System.out.println(" Tax slab of individual");
	}

	// methods are from IncomeCalcuation interface
	public void calcGrossIncome() {
		// TODO Auto-generated method stub
		System.out.println(" Interface 2 : gross");
		
	}

	public void removeDeductions() {
		// TODO Auto-generated method stub
		System.out.println(" Interface 2 : deductions");
	}

	public void replicatedMthd() {
		// TODO Auto-generated method stub
		
	}
	

}
