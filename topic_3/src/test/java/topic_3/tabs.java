package topic_3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class tabs {
	WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		        driver.manage().window().maximize();	       
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				   
		  
	  }
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  //Thread.sleep(2000);
		//clicking on the click
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		//Thread.sleep(2000);
		Set<String> windowid1=driver.getWindowHandles();
		Iterator<String> iterat1=windowid1.iterator();
		String firstswindow1=iterat1.next();
		String child1=iterat1.next();
		driver.switchTo().window(child1);
		//clicking on the "Above"
		 driver.findElement(By.xpath("/html/body/header/nav/div[1]/span")).click();
		 Thread.sleep(5000);
		 //clicking on the "Events"
		 driver.findElement(By.xpath("/html/body/header/nav/ul/div[3]/a")).click();
		 Thread.sleep(5000);
		 
		
	System.out.println("The title of the main window :"+ driver.getTitle());
//Verifying  the current page title
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Selenium Events");
		Assert.assertTrue(verifyTitle);
		
		driver.close();
	
		driver.switchTo().window(firstswindow1);
	System.out.println("the title of the main window "+ driver.getTitle());
		
		
	Boolean verifyTitle1 = driver.getTitle().equalsIgnoreCase("Frames & windows");
	Assert.assertTrue(verifyTitle1);
	  
	 
  }
 

  @AfterClass
  public void afterClass() {
	 
	 driver.quit();
	  
	  
	  
  }

}
