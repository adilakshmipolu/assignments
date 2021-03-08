package topic_3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class google_signup {
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  @Test
  public void f() throws Exception {
	  driver.get("https://accounts.google.com/signup");
	  Thread.sleep(5000);
		//sending the firstname
		driver.findElement(By.id("firstName")).sendKeys("adi");	
		//getting the value of firstname
		System.out.println(driver.findElement(By.id("firstName")).getAttribute("value"));
		//using assertTrue to verify the firstname
		String value=driver.findElement(By.id("firstName")).getAttribute("value");
		Assert.assertTrue(value.contentEquals("adi"));
		//sending the Lastname
		driver.findElement(By.id("lastName")).sendKeys("lakshmi");
		//getting the value of Lastname
		System.out.println(driver.findElement(By.id("lastName")).getAttribute("value"));
		//using assertTrue to verify the Lastname
		String value2=driver.findElement(By.id("lastName")).getAttribute("value");
		Assert.assertTrue(value2.contentEquals("lakshmi"));
		Thread.sleep(1000);
		//sending the username or gmail
		driver.findElement(By.id("username")).sendKeys("afhbdsjak");
		//getting the value of gmail
		System.out.println(driver.findElement(By.id("username")).getAttribute("value"));
		//using assertTrue to verify the gmail
		String value3=driver.findElement(By.id("username")).getAttribute("value");
		Assert.assertTrue(value3.contentEquals("afhbdsjak"));
		//sending the password
		driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("2345ydrf@7");
		//getting the value of password
		System.out.println(driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).getAttribute("value"));
		Thread.sleep(1000);
		//sending the confirm password
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("2345ydrf@7");
		//getting the value of confirm password
		System.out.println(driver.findElement(By.name("ConfirmPasswd")).getAttribute("value"));
		Thread.sleep(5000);
		//clicking on the next 
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[2]")).click();
		//sending the phone number
		driver.findElement(By.id("phoneNumberId")).sendKeys("3243546879");
		//getting the value of phone number
		System.out.println(driver.findElement(By.id("phoneNumberId")).getAttribute("value"));
		//using assertTrue to verify the phone number
		String value1=driver.findElement(By.id("phoneNumberId")).getAttribute("value");
		Assert.assertTrue(value1.contentEquals("3243546879"));
	
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }
;
}
