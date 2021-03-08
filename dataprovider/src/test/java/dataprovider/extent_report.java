package dataprovider;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class extent_report {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  Dimension d= new Dimension(800,480);
	  driver.manage().window().setSize(d);
	  ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("./reports/report1.html");
	  ExtentReports report=new ExtentReports();
	  report.attachReporter(htmlreport);
	  ExtentTest logger=report.createTest("size window");
	  logger.log(Status.INFO ,"login");
	  logger.log(Status.PASS,"resize");
	  report.flush();
  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adilakshmi.polu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();	       
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
}
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
