package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	
	
	@Test(priority = -1)
	public void createLead() {
		System.out.println("create lead");

	}
	
	//priority =0
	@Test
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test(priority = 3)
	public void deleteLead() {
		System.out.println("delete lead");

	}

}
