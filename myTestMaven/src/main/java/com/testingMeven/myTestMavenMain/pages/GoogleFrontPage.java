package com.testingMeven.myTestMavenMain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testingMeven.myTestMaven.webDriverInit;
import com.testingMeven.myTestMavenMain.locators.GoogleLocators;

public class GoogleFrontPage extends webDriverInit{
	
	
	public WebDriver googleBox(String searchText, WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath(GoogleLocators.searchBox)).sendKeys(searchText);
		return driver;
		
		}
	
	public WebDriver googleSearch(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath(GoogleLocators.searchButton)).click();
		
		return driver;
		}
	
	public WebDriver searchFrom(String searchFrom, WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath(GoogleLocators.searchFAROM)).sendKeys(searchFrom);
		return driver;
		}
	
	public WebDriver searchTo(String searchTo, WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath(GoogleLocators.searchTo)).sendKeys(searchTo);
		return driver;
		
		}
	
	public WebDriver searchButtonMMT(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath(GoogleLocators.searchButtonmmt)).click();
		
		return driver;
		}
	

}
