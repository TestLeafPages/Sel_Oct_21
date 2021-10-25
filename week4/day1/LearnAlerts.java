package week4.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		// Till alpha 6
		// deprecated
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// onetime call
		// polling - 500 millisecs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// SIMPLE ALERT
		// click on the Alert Box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		// get the text on that alert
		String text = alert.getText();
		
		System.out.println(" Simple Alert text:" + text);
		
	//	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	//	org.openqa.selenium.UnhandledAlertException
		
		// click Ok button
		alert.accept();
		// org.openqa.selenium.NoAlertPresentException

		// CONFIRMATION ALERT
     	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
   //    driver.switchTo().alert();
     	System.out.println(" confrimation text: " + alert.getText());
     	Thread.sleep(2000);
     	alert.dismiss();
     	
     	String text2 = driver.findElement(By.id("result")).getText();
     	if(text2.contains("OK")) {
     		System.out.println(" You pressed OK button");
     	}
     	else
     		System.out.println(" You pressed Cancel button");
     		
     	// PROMPT ALERT
     	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
     	alert.sendKeys("Edu");
     	alert.accept();
     	
     	
     	
     	
     	

	}

}
