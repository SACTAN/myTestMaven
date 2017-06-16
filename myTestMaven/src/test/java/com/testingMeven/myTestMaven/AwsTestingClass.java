package com.testingMeven.myTestMaven;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testingMeven.myTestMavenMain.pages.GoogleFrontPage;

public class AwsTestingClass extends webDriverInit {
	
	String url = "https://www.makemytrip.com/";
	public GoogleFrontPage gfrntpage = new GoogleFrontPage();
	
	//@Test
	public void testjavam() throws InterruptedException
	{
        System.out.println( "......Automation.....!" );	
		getDriver().get(url);
		maximiseWindow();
		implisiteWait();
		gfrntpage.googleBox("AWS");
		gfrntpage.googleSearch().click();
	   String title =  getDriver().getTitle();
		System.out.println("title of Page is :!" + title);
		Assert.assertEquals("Value is not expected", "Google", title);
		
	}
	
	@Test
	public void testMakemyrip() throws InterruptedException
	{
        System.out.println( "......Automation.....!" );	
		getDriver().get(url);
		maximiseWindow();
		implisiteWait();
		getDriver().findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys("NAGPUR");
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys("PUNE");
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//button[@id='searchBtn']")).click();
		Thread.sleep(2000);
		gfrntpage.searchFrom("NAGPUR");
		gfrntpage.searchTo("PUNE");
		gfrntpage.searchButtonMMT().click();
	   String title =  getDriver().getTitle();
		System.out.println("title of Page is :!" + title);
		Assert.assertEquals("Value is not expected", "Google", title);
		
	}

}
