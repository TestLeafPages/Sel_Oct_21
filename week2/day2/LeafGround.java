package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to minimize the window
		//driver.manage().window().minimize();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement eleFirstDropDown = driver.findElement(By.id("dropdown1"));
		Select dd = new Select(eleFirstDropDown);
		
		List<WebElement> options = dd.getOptions();
		
		System.out.println(options.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
