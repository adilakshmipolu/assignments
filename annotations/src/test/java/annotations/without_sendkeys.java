package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class without_sendkeys {
	
	WebDriver driver;
	@BeforeClass
	public void before() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

  @Test
  public void f() throws InterruptedException {
	  
		driver.get("https://github.com/login");
		
	  JavascriptExecutor JS = (JavascriptExecutor)driver;
	  //save the username webelement in a variable
	  WebElement username= driver.findElement(By.id("login_field"));
	  //save the password webelement in variable
	  WebElement password = driver.findElement(By.id("password"));
	  //providing the username and password to username & password.
	  JS.executeScript("arguments[0].value='adilakshmipolu87@gmail.com'", username);
	  JS.executeScript("arguments[0].value='god'", password);
	  Thread.sleep(1000);
	  //click on the commit
	  driver.findElement(By.name("commit")).click();
  }
  @AfterClass
  public void afterClass() {
driver.quit();
	
  }
}
