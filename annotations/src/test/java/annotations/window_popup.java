package annotations;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class window_popup {
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
	 //open the url
           driver.get("http://demo.automationtesting.in/Windows.html");
           //clicked on the "Open new separate windows"
		   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		   Thread.sleep(2000);
		   //clicked on the "Click"
		   driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();   
		    Set<String> handleWindow = driver.getWindowHandles();
		        Iterator<String> first = handleWindow.iterator();       
		        String parentWindow = first.next();
		        String childWindow = first.next();       
		        driver.switchTo().window(childWindow); 
		        //getting the title of page
		        System.out.println("Child Window Title: "+driver.getTitle());
		        //arrange the dimensions of the page
		        Dimension d = new Dimension(800,480);
		        driver.manage().window().setSize(d);
		        Thread.sleep(5000);	
		        //closed the childwindow
		        driver.close();         
		        driver.switchTo().window(parentWindow);  
		        System.out.println("Parent Window Title: "+driver.getTitle());		       
  }
  @AfterClass
  public void afterClass() {
  driver.quit();
  }

  }

 
