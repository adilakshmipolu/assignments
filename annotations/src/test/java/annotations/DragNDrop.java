package annotations;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragNDrop {
	WebDriver driver;
	
	@BeforeTest
	public void before() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

  @Test
  public void test() throws InterruptedException {
		
	 String URL = "https://jqueryui.com/droppable/"; 				 
	 driver.get(URL);	 
	 //open the  url
		 driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
			Actions action =new Actions(driver);//
			//drag and dropped here
			action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
			.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
			.release().build().perform();		
			System.out.println("dropped Sucessfully");
  }
 @AfterTest
 public void afterClass() {
driver.quit();
	
  }
}