package com.testingMeven.myTestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webfirfoxtest {
	
	public  WebDriver driver = null;
	String url = "https://www.google.co.in";
	
	@BeforeTest
	public void openBrowser()
	{
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testTtile()
	{
		driver.get(url);
	    driver.manage().window().maximize();
	   String title =  driver.getTitle();
	   System.out.println("title of the window ; " + title);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
