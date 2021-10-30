package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGTestCases extends BaseClass {

	@BeforeMethod
	public void preCondition() {
		System.out.println("PreCondition for test1");
	  }
  
  @Test
  public void test1() {
	  System.out.println("test1");
  }
   
 
 

}
