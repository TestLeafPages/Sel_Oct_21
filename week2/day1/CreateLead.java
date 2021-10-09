package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to minimize the window
		//driver.manage().window().minimize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		// step1: locate element
		WebElement eleUsername = driver.findElement(By.id("username")); // shortcut to save in a variable cntrl+2, L
		// Step2: to type a value in a text field
		eleUsername.sendKeys("Demosalesmanager");
		
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		

	}

}
