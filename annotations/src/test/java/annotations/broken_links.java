package annotations;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class broken_links {
	WebDriver driver;
	@BeforeTest
	public void before() throws Exception {
   

     System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	 driver = new ChromeDriver();
        driver.manage().window().maximize();	       
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	 @Test
	 public void f() throws Exception {
        
        String url = "http://www.zlti.com";  
        driver.get(url);
        //list the links of the webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> link = links.iterator();
        
        while(link.hasNext()){
        	 String url1 = "";
            
            url1 = link.next().getAttribute("href");
            
            System.out.println(url1);
        
            if(url1 == null || url1.isEmpty()){
            System.out.println("URL is null or emplty.");
                continue;
            }
            
            if(!url1.startsWith(url)){
                System.out.println("URL is  belongs to the other domain.");
                continue;
            }
 
        }
	 }
        @AfterTest
    	public void afterClass()  throws Exception {
        
        driver.quit();

    }
}
