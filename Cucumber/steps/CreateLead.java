package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	

}
