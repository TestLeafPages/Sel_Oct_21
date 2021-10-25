package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
		// takes the control to the main document
		driver.switchTo().defaultContent();
				
		
		// takes the control to the just higher frame
	     //	driver.switchTo().parentFrame();
		
		WebElement mainframe2 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
		driver.switchTo().frame(mainframe2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
