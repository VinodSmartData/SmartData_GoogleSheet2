package SmartData_Appilcation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


import Object_Repository.SmartData_Object;
import SmartData_GoogleSheet.TestGoogleSheet;

import org.testng.annotations.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SmartData_App extends SmartData_Object
{
	WebDriver driver;
	
	@BeforeSuite
	public void Driver_Int()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinod\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void SmartData_App_Inti() throws  GeneralSecurityException, IOException, InterruptedException 
	{
		driver.get("https://www.smartdata.net/");
		List<List<Object>> values =TestGoogleSheet.GetData();
			if (values == null || values.isEmpty())   
			{
				System.out.println("No data found.");
			} 
			
		//System.out.println(values.get(1).toString());
		//driver.get("https://www.smartdata.net/");
		driver.findElement(MainMenu).click();
		Thread.sleep(2000);
		driver.findElement(WhoWeAre).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		if(driver.findElement(JobOpening).isDisplayed())
		{
			System.out.println("Who We are page Navigated Sucessfully");
			
		}
		driver.findElement(JobOpening).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		if(driver.findElement((OpeningOneJob)).isDisplayed())
				{
					System.out.println("Application Navigated to Current Openings");
				}
		driver.findElement(OpeningOneJob).click();
		if (driver.findElement(EasyApply).isDisplayed())
		{
			System.out.println("First Job Opend Sucessfully");			
		}
		driver.findElement(EasyApply).click();
		if(driver.findElement(CancelJob).isDisplayed())
		{
			driver.findElement(BackToJobs).click();
			System.out.println("Page Navigated to All the Jobs Page");
		}
	}
	
	@AfterSuite
	public void Driver_Close()
	{
		driver.quit();
	}
}
