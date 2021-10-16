package week3.day1;

public class ExecutionClassInterface {

	public static void main(String[] args) {
		
		CalcTaxIndividuals objIndiv = new CalcTaxIndividuals();
		
		objIndiv.calcDeductions("Ram", 4356.549, 234234);
		objIndiv.calcGrossIncome("ram", 20000, 2000);
		objIndiv.taxSlab();
		
		objIndiv.calcGrossIncome(null, 0, 0);  // taxClac interface
		objIndiv.calcGrossIncome();   // IncomeCalc interface
		objIndiv.removeDeductions();
		
		// object cannot be created for an interface
		//TaxCalculation objtax = new TaxCalculation();
	}
}
