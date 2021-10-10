package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToReadText {

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
		
		String text2 = driver.findElement(By.id("username")).getText();
		System.out.println(text2);
	

	}

}
