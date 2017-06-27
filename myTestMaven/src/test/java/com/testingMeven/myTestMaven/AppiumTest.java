package com.testingMeven.myTestMaven;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumTest {
	
	RemoteWebDriver driver;
	
	
	  @BeforeTest
	  public void beforeTest() throws MalformedURLException {
		  
		  String AppisPresent = "Yes";
		  
		  
		  if(AppisPresent.equalsIgnoreCase("Yes")){
		  
		  //Appium for native App
		  File app= new File ("Resource\\TheMallApp.apk");
		  
		  DesiredCapabilities cap= DesiredCapabilities.android();
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("deviceName", "5PLFRCJVKVQG9SM7");
		  cap.setCapability("platformVersion", "6.0");
		  cap.setCapability("app", app.getAbsolutePath());
		  driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		  }else{	  
		  //Appium for web App
		  DesiredCapabilities cap= DesiredCapabilities.android();
		  //Version 46 campatible
		  cap.setCapability("browserName", "chrome");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "6.0");
		  //sachin Lenovo
		  cap.setCapability("deviceName", "5PLFRCJVKVQG9SM7");
		  //vikas moto device
		 // cap.setCapability("deviceName", "ZY2237953H");
		  driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		  }	  
		  
		  
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  }
	  @Test
	  public void f() 
		{
			WebElement loginID=driver.findElement(By.id("com.demo.amanora:id/loginGold"));
			takeScreenshot("lOGINbUTTON");
//			 WebElement loginID=driver.findElement(By.name("Kedar Bindu (Gold)"));
			loginID.click();
			takeScreenshot("lOGINbUTTON");
			WebElement subelement=driver.findElement(By.id("com.demo.amanora:id/OffersLayout"));
			subelement.click();
	  }
	  
	 // @Test
	  public void mobileApp() throws InterruptedException
	  {			   
		    driver.get("http://www.facebook.com");
		    System.out.println("Title "+driver.getTitle());
		    takeScreenshot("lOGINbUTTON");
		    driver.findElement(By.name("email")).sendKeys("sachinbhute@gmail.com");
		    takeScreenshot("lOGINbUTTON2");
		    driver.findElement(By.name("pass")).sendKeys("ADPadp39");
		    takeScreenshot("lOGINbUTTON3");
		    driver.findElement(By.id("u_0_6")).click();	   
		    takeScreenshot("lOGINbUTTON4");
		  Thread.sleep(10000);	
		  takeScreenshot("lOGINbUTTON5");
	  }
	  
	  @AfterTest
	  public void afterTest() 
	  {
		  driver.quit();
	  }
	  
	  public boolean takeScreenshot(final String name) {
	       String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	      // String screenshotDirectory = System.getProperty("user.dir");
	       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	   }

}
