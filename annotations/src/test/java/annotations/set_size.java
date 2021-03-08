package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class set_size {
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
	 		Thread.sleep(3000);
	 		//opening the url
		driver.get("https://www.google.com");
		//arrange the page dimentions
		 Dimension d = new Dimension(800,480);
	      
	      driver.manage().window().setSize(d);
		  
  }
  @AfterClass
 public void afterClass() {
driver.quit();
	     	 
  }
}
