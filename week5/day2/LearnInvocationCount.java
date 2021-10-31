package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocationCount {
	
	//Creating Lead -> to generate test data -> 100 Lead Ids
	@Test(invocationCount = 5)
	public void createLead() {
		System.out.println("create lead");

	}

}
