package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scroll_webpage {
	
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
	 
	  driver.get("http://demo.guru99.com/test/guru99home/");
  Thread.sleep(4000);
  //scrooling the webpage by(0,1000)
  JavascriptExecutor js = (JavascriptExecutor) driver;   
   js.executeScript("window.scrollBy(0,1000)");
   Thread.sleep(5000);
  System.out.println("window scrolled successfully");
   
  }
  @AfterClass
  public void afterClass() {
   driver.quit();
  }
}
