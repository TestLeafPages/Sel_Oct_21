package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc_Flights {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(" https://www.irctc.co.in/ ");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		
		Set<String> wHandles = driver.getWindowHandles();
		List<String> wHandlesList = new ArrayList<String>(wHandles);
		driver.switchTo().window(wHandlesList.get(1));
		String email = driver.findElement(By.xpath("(//div[@class='block-nav-right d-none d-md-block'])[2]")).getText();
		System.out.println("Email :-" + email);

		driver.switchTo().window(wHandlesList.get(0));
		String title = driver.getTitle();
		System.out.println("First Window :" + title);
		driver.close(); // close only the first window

	}

}
