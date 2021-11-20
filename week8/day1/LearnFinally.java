package week8.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFinally {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
			
		try {
			driver.findElement(By.id("username123")).sendKeys("Demo");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		} 
		finally {
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		}
		
		
		System.out.println("End of the program");
				
				

	}

}
