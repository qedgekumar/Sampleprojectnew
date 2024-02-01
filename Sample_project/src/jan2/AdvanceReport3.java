package jan2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AdvanceReport3 {
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	@BeforeTest
	public void generatereport()
	{
		 report=new ExtentReports("./ExtentReoprts3/.Demo3.html");
	}
    @BeforeMethod
    public void setUp() 
    {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.navigate().to("https://google.com");
    	
    	
    }
    @Test
    public void startTest()
    {
    	logger=report.startTest("My test pass");
    	logger.assignAuthor("pavan");
    	logger.assignCategory("Functional");
    	String Expected="Google";
    	String Actual=driver.getTitle();
    	if (Actual.equalsIgnoreCase(Expected)) {
    		logger.log(LogStatus.PASS, "Title is matching");
			
		} else {
			logger.log(LogStatus.FAIL, "Title is not matching");

		}
    	
    }
    @Test
    public void failtest()
    {
    	logger=report.startTest("My test fail");
    	logger.assignAuthor("pavan");
    	logger.assignCategory("Functional");
    	String Expected="Gmail";
    	String Actual=driver.getTitle();
    	if (Expected.equalsIgnoreCase(Actual)) {
    		logger.log(LogStatus.PASS, "Title is matching");
			
		} else {
			logger.log(LogStatus.FAIL, "Title is not matching");

		}
    }
    @AfterMethod
    public void tearDown()
    {
    	report.endTest(logger);
    	report.flush();
    	driver.quit();
    }
}
