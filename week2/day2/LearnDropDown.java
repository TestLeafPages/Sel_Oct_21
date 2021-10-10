package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

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
		
		//Source drop down
		
		//step1: locate the select tag
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//eleSource.sendKeys("Conference");
		
		//step2: Create object for Select
		Select dropDown = new Select(eleSource);
		
		//step3: Select the value using visible text
		//dropDown.selectByVisibleText("Conference");
		
		//Select the value using Index
		dropDown.selectByIndex(4);
		
		//select by value
		//dropDown.selectByValue("LEAD_PARTNER");
		
		
		//marketing campaign drop down
		WebElement eleMarkCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown1 = new Select(eleMarkCamp);
		dropDown1.selectByVisibleText("Automobile");
		
		
		//Industry drop down
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown2 = new Select(eleIndustry);
		dropDown2.selectByValue("IND_HARDWARE");
				
		
		
		//driver.findElement(By.name("submitButton")).click();
		
		

	}

}
