package com.testingMeven.myTestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class myjavaMevnclassTest {
	
	@Test
	public void testjavam()
	{
		System.out.println("testing is best at all");
		System.out.println("2nd commit");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.eclipse.org/egit/download/");
		String tile = driver.getTitle();
		System.out.println("title of Page is :!" + tile);
		
	}

}
