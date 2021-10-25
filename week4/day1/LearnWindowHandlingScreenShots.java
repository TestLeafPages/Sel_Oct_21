package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandlingScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		
		//step1
		Set<String> winSet = driver.getWindowHandles();   // 2 handles
		List<String> winList = new ArrayList<String>(winSet);
		
		System.out.println(" Number of total windows :" + winList.size());
		// wind1 get(0)
		// wind2 get(1)
		System.out.println(" window 1 :" + driver.getTitle());
		
		driver.switchTo().window(winList.get(1));
		System.out.println(" window 2 :" + driver.getTitle());
	//	driver.close();
	//	driver.quit();
		
		driver.switchTo().window(winList.get(0));
		System.out.println(" window 1 :" + driver.getTitle());
		
		// screenshot of the webPage
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/pic1.png");
		FileUtils.copyFile(src, dst);
		
		WebElement webEle = driver.findElement(By.xpath("//button[text()='Open Home Page']"));
		File src1 = webEle.getScreenshotAs(OutputType.FILE);
		File dst1 = new File("./snaps/pic2.png");
		FileUtils.copyFile(src1, dst1);
		
		
		
		
		
		
		
		
	//	driver.switchTo().window("adjasjdl");
		
		
		// to find how many windows are loaded 
		// size of the list
		
		

		

	}

}
