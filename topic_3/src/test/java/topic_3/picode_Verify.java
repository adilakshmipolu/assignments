package topic_3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class picode_Verify {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
  }
  @Test
  public void f() {
	  driver.get("http://chennaiiq.com/chennai/pincode-by-name.php");
		//feching the table in the url
		WebElement table= driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]"));
		List <WebElement> row= table.findElements(By.tagName("tr"));
		for (int i=3;i<=row.size();i++) {
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			String pin1=col.get(2).getText();
			for (int j=i;j<=row.size()-1;j++) {
				List<WebElement>newcol=row.get(j).findElements(By.tagName("td"));
				String pin2=newcol.get(2).getText();
				//verifythe  pincode to another pincode
				Assert.assertFalse(pin1==pin2);
				
				
				
				
			}
			
		}
		
	 System.out.println("pincode verification successfully."); 
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
