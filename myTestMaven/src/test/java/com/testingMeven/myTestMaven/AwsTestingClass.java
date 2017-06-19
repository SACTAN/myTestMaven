package com.testingMeven.myTestMaven;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.testingMeven.myTestMavenMain.pages.GoogleFrontPage;
import com.testingMeven.myTestMavenMain.utilities.ExcelUtils;

public class AwsTestingClass extends webDriverInit {
	
	String url = "https://www.makemytrip.com/";
	String urlg = "https://www.google.co.in/?gfe_rd=cr&ei=u0VGWe6NIq798we-2rGgBw&gws_rd=ssl";
	public GoogleFrontPage gfrntpage = new GoogleFrontPage();
	
	@Test
	public void googleTest() throws InterruptedException
	{
        System.out.println( "......Google Test Case.....!" );	
		getDriver().get(urlg);
		maximiseWindow();
		implisiteWait();
		gfrntpage.googleBox("AWS", getDriver());
		gfrntpage.googleSearch(getDriver());
	   String title =  getDriver().getTitle();
		System.out.println("Title of Page is : " + title);
		Assert.assertEquals("Value is not expected", "Google", title);
		
	}
	
	@Test
	public void testMakemyrip() throws Exception
	{
        System.out.println( "......Make My Trip.....!" );	
        boolean flag = true;
		getDriver().get(url);
		implisiteWait();
		Thread.sleep(2000);
		System.out.println("Value for cell 1 and 1 "+ ExcelUtils.getCellData(1, 1));
		gfrntpage.searchFrom(ExcelUtils.getCellData(1, 0),getDriver());
		gfrntpage.searchTo(ExcelUtils.getCellData(1, 1),getDriver());
		gfrntpage.searchButtonMMT(getDriver());
	   WebDriverWait waitWb = new WebDriverWait(getDriver(),30);
	   waitWb.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("html body.ng-scope div#content div.ng-scope "
	   		+ "div.container.ng-scope div.row div.main.col-lg-9.col-md-9.col-sm-12.col-xs-12 div.clearfix.listing_row.append_bottom8."
	   		+ "sponsored_list_wrapper.shadow_genrator_1.c-listing_row.c-listing_row--versionI.ng-scope div.listing_top.clearfix div.c-listing_row__more.c-listing_row_append.clearfix div.pull-right.hidden-xs span.open_icon_markwrapper.pull-left.noPadTop a.o-c-listing_row__flightD.pull-left.open_icon_mark")));
		Assert.assertTrue("Test case is passed", flag);
	}

}
