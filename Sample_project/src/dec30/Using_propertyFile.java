package dec30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_propertyFile {
WebDriver driver;
Properties conpro;
@BeforeTest
public void setup() throws Throwable
{
	conpro = new Properties();
	driver =new ChromeDriver();
	//load file
	conpro.load(new FileInputStream("login.properties"));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(conpro.getProperty("Url"));
	
}
@Test
public void StartTest()
{
	driver.findElement(By.xpath(conpro.getProperty("objuser"))).sendKeys(conpro.getProperty("Enteruser"));
	driver.findElement(By.xpath(conpro.getProperty("objpass"))).sendKeys(conpro.getProperty("Enterpass"));
	driver.findElement(By.xpath(conpro.getProperty("objLogin"))).sendKeys(Keys.ENTER);
	String Expected="dashboard";
	String Actual=driver.getCurrentUrl();
	if (Actual.contains(Expected)) {
		Reporter.log("username and password are valid::"+Expected+"   "+Actual,true);
		
		
		
	} else {
		//capture error message
		String Error_message=driver.findElement(By.xpath(conpro.getProperty("objError"))).getText();
		Reporter.log(Error_message+Expected+"  "+Actual,true);

	

	
	
	
}
}
	@AfterTest
	public void tearDown() 
	{
		driver.quit();
	}
	
	

}
	


	



