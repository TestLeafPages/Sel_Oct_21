package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	

	/*
	 * @Given("Open the Chrome Browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 * 
	 * @Given("Load the application url {string}") public void
	 * loadApplicationUrl(String url) { driver.get(url); }
	 */
	
	@Given("Enter username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Enter password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Title should be matching with {string}")
	public void verifyHomePage(String expTitle) {
		String actTitle = driver.getTitle();
		if(actTitle.equals(expTitle)) {
			System.out.println("homepage is displayed");
		}else {
			System.out.println("homepage is not displayed");
		}
		

	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}

	
}
