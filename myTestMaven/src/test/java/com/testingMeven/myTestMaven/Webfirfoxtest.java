package com.testingMeven.myTestMaven;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.testingMeven.myTestMavenMain.pages.GoogleFrontPage;

public class WebfirfoxTest extends webDriverInit{
	
	
	//public  WebDriver driver = null;
	String url = "https://www.google.co.in";
	public GoogleFrontPage gfrntpage = new GoogleFrontPage();
	
	
	@Test(priority=0)
	public void verifyTitle() throws InterruptedException
	{		
		getDriver().get(url);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		gfrntpage.googleBox("AWS");
		gfrntpage.googleSearch().click();
	   String title =  getDriver().getTitle();
	   System.out.println("title of the window ; " + title);
	}
	
}
