package framework_setup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is for testng Setup");  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is BeforeMethod");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is AfterMethod");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is BeforeClass");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("this is AfterClass");
  
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.close();
  }
		
		
	  
}
