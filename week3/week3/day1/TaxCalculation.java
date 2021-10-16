package week3.day1;

public interface TaxCalculation {

	// no method body - unimplemented methods
	/**
	 * This method calculates the deductions of a person/business unit/co-operative society 
	 * Author : sheriba
	 * 
	 * @param name
	 * @param HRA
	 * @param LTA
	 */
	void calcDeductions(String name, double HRA, double LTA);
	
	/**
	 * 
	 * @param name
	 * @param netIncome
	 * @param deductions
	 */
	void calcGrossIncome(String name, double netIncome, double deductions);
	
	 void replicatedMthd();

}
