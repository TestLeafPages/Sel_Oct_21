package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	
	@Test
	public void login() {
		//"Leaftaps - TestLeaf Automation Platform"
		String expTitle = "TestLeaf Automation Platform";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		String actTitle = driver.getTitle();
		
		//SoftAssert
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expTitle, actTitle);
		
		//Hard Assert
		
		//Assert.assertTrue(displayed); //true -> passed ; false -> failed
		
		//Assert.assertFalse(displayed); //false -> passed ; true -> failed
		
		//String actTitle = driver.getTitle();
		//Assert.assertEquals(actTitle, expTitle);
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("Matching"); }else {
		 * System.out.println("Not Matching"); }
		 */
		
		
		System.out.println("End of program");
		
		//mandatory step for soft assert
		sa.assertAll();
		
		
		

	}

}
