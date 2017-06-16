package com.testingMeven.myTestMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class webDriverInit {
	public WebDriver driver;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@BeforeSuite
	public void gettest() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "F:\\New folder\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		Thread.sleep(2000);
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
