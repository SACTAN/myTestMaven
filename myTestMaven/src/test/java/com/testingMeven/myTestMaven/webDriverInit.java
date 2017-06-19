package com.testingMeven.myTestMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.testingMeven.myTestMavenMain.utilities.Constants;
import com.testingMeven.myTestMavenMain.utilities.ExcelUtils;


public class webDriverInit {
	public WebDriver driver;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@BeforeSuite
	public void gettest() throws Exception
	{
		String directory = System.getProperty("user.dir");
		System.out.println("path of directory : "+ directory);
		System.setProperty("webdriver.gecko.driver", directory+"\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		Thread.sleep(2000);
		
		//set data file path and sheet
		//String directory = System.getProperty("user.dir");
		ExcelUtils.setExcelFile(directory+Constants.Path_TestData + Constants.File_TestData,"TESTdata");
	}
	
	public WebDriver getDriver() throws InterruptedException
	{
		return driver;
	}

	@AfterSuite
	public void closeBrowser() throws InterruptedException
	{
		getDriver().quit();
	}
	
public void maximiseWindow() throws InterruptedException
{
	getDriver().manage().window().maximize();
	
	}

public void implisiteWait() throws InterruptedException
{
	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

}
