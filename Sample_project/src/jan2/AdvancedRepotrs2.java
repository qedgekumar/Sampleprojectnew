package jan2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AdvancedRepotrs2 {
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	@BeforeTest
	public void generateReport() 
	{
		//define path for html report
		report=new ExtentReports("./ExtentReports1/demo1.html");
		
	}
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com");
		
	}
	@Test
	public void passtest()
	{
		//test case starts here
		logger=report.startTest("My test pass");
		logger.assignAuthor("Pavan");
		logger.assignCategory("Functional");
		String Expected="Google";
		String Actual=driver.getTitle();
		if (Actual.equalsIgnoreCase(Expected)) {
			logger.log(LogStatus.PASS,"Title is matching"+"   "+Expected+"    "+Actual);
			
			
		} else {
			logger.log(LogStatus.FAIL, "Title is not matching"+"   "+Expected+"   "+Actual);

		}
		
		
		
			
			
		
	}
	@Test
	public void failtest()
	{
		logger=report.startTest("My test fail");
		logger.assignAuthor("Pavan");
		logger.assignCategory("Functional");
		String Expected="Gmail";
		String Actual=driver.getTitle();
		if (Actual.equalsIgnoreCase(Expected)) {
			logger.log(LogStatus.PASS, "Title is matching"+"   "+Expected+"  "+Actual);
			
		} else {
			logger.log(LogStatus.FAIL, "Title is not matching"+"  "+Expected+"   "+Actual);

		}
		
	}
	@AfterTest
	public void tearDown()
	{
	report.endTest(logger);
	report.flush();
	driver.quit();
	}

}
