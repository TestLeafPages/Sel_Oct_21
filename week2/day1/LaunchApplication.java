package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//Step1: Setup the Driver (download the driver and setup path)
		WebDriverManager.chromedriver().setup();
				
		//step2: To open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//step3: To load the application url
		driver.get("http://leaftaps.com/opentaps/");
		
		Thread.sleep(2000);
		
		//ste4: to close the browser
		driver.close();
		
		

	}

}
