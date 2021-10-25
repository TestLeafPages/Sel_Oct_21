package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// step 1 : find the table
		WebElement webTable = driver.findElement(By.id("table_id"));
		// step 2: Get all the rows
		//driver.findElement(By.)
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		// get the number of rows in the table
		System.out.println(" Number of rows in the table:" + tableRows.size());
		// get the number of columns
		WebElement firstRow = tableRows.get(1);
		List<WebElement> tableCol = firstRow.findElements(By.tagName("td"));
		System.out.println(" Number of columns in the table:" + tableCol.size());
		// print all the contents of the table
		for (WebElement eachRowElement : tableRows) {
			System.out.println(eachRowElement.getText());
		}
		// print the contents column 2 alone
		for (int i = 1; i < tableRows.size(); i++) {
			WebElement row = tableRows.get(i);
			List<WebElement> col = row.findElements(By.tagName("td"));
			String colText = col.get(1).getText();
			System.out.println(colText);
		}
		
		List<WebElement> learnLocatorsList = driver.findElements(By.xpath("//table//td[text()='Learn Locators']/following-sibling::td"));
		
		
		
	}
}
