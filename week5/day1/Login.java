package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		
		// step1: locate element
		WebElement eleUsername = driver.findElement(By.id("username")); // shortcut to save in a variable cntrl+2, L
		// Step2: to type a value in a text field
		eleUsername.clear();
		eleUsername.sendKeys("Demosalesmanager");
		
			

		// using tagName locator
		// driver.findElement(By.tagName("input")).sendKeys("Demosalesmanager");

		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String expTitle = "Testleaf Automation";
		
		String actTitle = driver.getTitle();
		
		if(expTitle.equals(actTitle)) {
			System.out.println("Matching");
		}else {
			System.out.println("Not matching");
		}
		
		
	}

}
