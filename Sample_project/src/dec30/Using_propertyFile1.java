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
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_propertyFile1 {
	WebDriver driver;
	Properties conpro;
	@BeforeTest 
	public void setup() throws Throwable
	{
		conpro=new Properties();
		conpro.load(new FileInputStream("login1.properties"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(conpro.getProperty("Url"));
		driver.findElement(By.xpath(conpro.getProperty("objuser"))).sendKeys(conpro.getProperty("Enteruser"));
		driver.findElement(By.xpath(conpro.getProperty("objpass"))).sendKeys(conpro.getProperty("Enterpass"));
		driver.findElement(By.xpath(conpro.getProperty("objlogin"))).sendKeys(Keys.ENTER);

	}

	@Test
	public void StartTest() throws Throwable{
		{
			driver.findElement(By.xpath(conpro.getProperty("objBranches"))).click();

			driver.findElement(By.xpath(conpro.getProperty("objNewBranch"))).click();

			driver.findElement(By.xpath(conpro.getProperty("objBranchName"))).sendKeys(conpro.getProperty("Enterbranchname"));
			driver.findElement(By.xpath(conpro.getProperty("objAddress1"))).sendKeys(conpro.getProperty("EnterAdd1"));
			driver.findElement(By.xpath(conpro.getProperty("objAddress2"))).sendKeys(conpro.getProperty("EnterAdd2"));
			driver.findElement(By.xpath(conpro.getProperty("objAddress3"))).sendKeys(conpro.getProperty("EnterAdd3"));
			driver.findElement(By.xpath(conpro.getProperty("objArea"))).sendKeys(conpro.getProperty("EnterArea"));
			driver.findElement(By.xpath(conpro.getProperty("objZip"))).sendKeys(conpro.getProperty("EnterZip"));

			new Select(driver.findElement(By.xpath(conpro.getProperty("objCountry")))).selectByIndex(1);
			new Select(driver.findElement(By.xpath(conpro.getProperty("objState")))).selectByIndex(1);
			new Select(driver.findElement(By.xpath(conpro.getProperty("objcity")))).selectByIndex(1);

			driver.findElement(By.xpath(conpro.getProperty("objsubmit"))).click();

			String alerttext=driver.switchTo().alert().getText();
			Reporter.log(alerttext,true);

			driver.switchTo().alert().accept();
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
