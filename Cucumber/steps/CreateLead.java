package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("Click on {string} link")
	public void clickCRMSFA(String partialText) {
		driver.findElement(By.linkText(partialText)).click();

	}
	
	@Then("{string} Page should be displayed")
	public void verifyPage(String partialText) {
		boolean displayed = driver.findElement(By.xpath("//div[contains(text(),'"+partialText+"')]")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}

}
