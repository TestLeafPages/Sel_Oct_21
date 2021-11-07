package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups = {"functional","smoke"})
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();
	}
	
	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test(groups = {"functional","regression"}, dependsOnGroups = "smoke")
	public void deleteLead() {
		System.out.println("Delete Lead");

	}
	
	@Test(groups = {"smoke"})
	public void duplicateLead() {
		System.out.println("Duplicate Lead");

	}
	
	@Test(groups = {"functional"}, dependsOnGroups = "smoke")
	public void mergeLead() {
		System.out.println("Merge Lead");

	}

}
