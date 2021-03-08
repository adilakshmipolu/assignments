package annotations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class google_search {
	WebDriver driver;
	
	@BeforeClass
	public void before() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
  @Test
  public void test() throws InterruptedException {
	
		driver.get("http://www.google.com");
		//searching for the data
	 driver.findElement(By.name("q")).sendKeys("telugu");
     long end = System.currentTimeMillis() + 5000;
		while (System.currentTimeMillis() < end) {
		WebElement resultsDiv = driver.findElement(By.className("aajZCb"));
		Thread.sleep(5000);		
if (resultsDiv.isDisplayed()) {

	break;

		}
		}
		//list the all suggestions appear in the suggestions
	List<WebElement> allSuggestions = driver.findElements(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/ul"));

		for (WebElement suggestion : allSuggestions) {

		System.out.println(suggestion.getText());
		}
		//clicking on the first suggestion
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div")).click();

		}
		 @AfterClass
		  public void afterClass() {
		driver.quit();
		
		
		
	  }
 
	
  }

