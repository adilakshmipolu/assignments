package topic_3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class screenshot {
 WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
  }
  @Test
  public void f() throws IOException, Exception {
	  driver.get("https://api.jquery.com/dblclick/");
	  Thread.sleep(5000);
		
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  		
	  		//Using the FileUtils class copy the generated screenshot file to any location
	  FileUtils.copyFile(scrFile, new File("C:\\Users\\adilakshmi.polu\\Desktop\\workspace\\topic_3\\screenshots\\homePageScreenshot.png"));
      System.out.println("Screenshot done successfully"); 
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
