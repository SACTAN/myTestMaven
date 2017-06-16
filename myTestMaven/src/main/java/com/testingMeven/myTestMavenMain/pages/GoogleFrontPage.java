package com.testingMeven.myTestMavenMain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testingMeven.myTestMaven.webDriverInit;
import com.testingMeven.myTestMavenMain.locators.GoogleLocators;

public class GoogleFrontPage extends webDriverInit{
	
	private WebElement element = null;
	
	public void googleBox(String searchText) throws InterruptedException
	{
		getDriver().findElement(By.xpath(GoogleLocators.searchBox)).sendKeys(searchText);;
		
		}
	
	public WebElement googleSearch() throws InterruptedException
	{
		element= getDriver().findElement(By.xpath(GoogleLocators.searchButton));
		
		return element;
		}
	
	public void searchFrom(String searchFrom) throws InterruptedException
	{
		getDriver().findElement(By.xpath(GoogleLocators.searchFAROM)).sendKeys(searchFrom);;
		
		}
	
	public void searchTo(String searchTo) throws InterruptedException
	{
		getDriver().findElement(By.xpath(GoogleLocators.searchTo)).sendKeys(searchTo);;
		
		}
	
	public WebElement searchButtonMMT() throws InterruptedException
	{
		element= getDriver().findElement(By.xpath(GoogleLocators.searchButtonmmt));
		
		return element;
		}
	

}
