package week5.day2;

import org.testng.annotations.Test;

public class LearnEnabled {
	
	
	@Test(priority = -1)
	public void createLead() {
		System.out.println("create lead");

	}
	
	
	@Test(enabled = false, priority = 2)
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test(priority = 3)
	public void deleteLead() {
		System.out.println("delete lead");

	}

}
