package dataprovider;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class dataprovide {
WebDriver driver;
  	
  	@DataProvider(name = "test-data")
  	public Object[][] dataProvFunc(){
        	return new Object[][]{
              	{"Lambda Test"},{"Automation"}
        	};
  	}
  	
  	@BeforeMethod
  	  public void setUp() {
        	 
        	  System.out.println("Start test");
        	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        	  driver = new ChromeDriver();
        	  String url = "https://www.google.com";
        	  driver.get(url);
        	  driver.manage().window().maximize();
        	 
  	  }
  	//Passing the dataProvider to the test method through @Test annotation
  	@Test(dataProvider ="test-data")
  	public void search(String key){
        	WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        	  searchbox.sendKeys(key);
        	  Reporter.log("Keyword entered is : " +key);
        	  searchbox.sendKeys(Keys.ENTER);
        	  Reporter.log("Search results are displayed.");
  	}
  	
  	@AfterMethod
  	public void burnDown(){
        	driver.quit();
  	}
 
}