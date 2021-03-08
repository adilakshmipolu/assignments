package annotations;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;


public class DropDown {
	WebDriver  driver;
	
	 @BeforeTest
	  public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
	  }
  
  @Test
  public void test() {
	  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	  //clicked on the dropdown button
	  driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown-toggle btn btn-default')]")).click();
	  //takes the list of the values in the dropdown
	  List<WebElement> list= driver.findElements(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul"));	
	 System.out.println(list.size());
	 for (int i=0;i<list.size();i++) {
		 System.out.println(list.get(i).getText());		 
	 }  
  }

  @AfterTest
  public void afterClass() {
	  driver.quit();
  }

}
