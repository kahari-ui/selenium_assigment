package com.qa.testscripts;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class getElementByCSSSelectorTC14 extends TestBaseTC1andTC6andTC9{
	OrangePages OrangeOR;
	
	@BeforeMethod
	public void loadPages() {
		OrangeOR = new OrangePages(driver);
	}
	
	@Test(priority = 14)
	public void getElementsByCSSSelector() {
		

		
		driver.findElement(By.cssSelector("#menu_pim_viewPimModule")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("pim"));
		
		
		driver.findElement(By.cssSelector("#menu_time_viewTimeModule")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("time"));
		
		driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("maintenance"));
		
		
		
		driver.findElement(By.cssSelector("#menu_dashboard_index")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		driver.findElement(By.cssSelector("div.box:nth-child(3) div.inner div.outerbox.no-border:nth-child(1) div.maincontent.group-wrapper div.panel_wrapper div.panel_draggable.panel-preview fieldset.panel_resizable.panel-preview table.quickLaungeContainer tbody:nth-child(1) tr:nth-child(1) td:nth-child(1) > div.quickLaunge")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("leave"));
		
		driver.findElement(By.cssSelector("#menu_dashboard_index")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		driver.findElement(By.cssSelector("div.box:nth-child(3) div.inner div.outerbox.no-border:nth-child(1) div.maincontent.group-wrapper div.panel_wrapper div.panel_draggable.panel-preview fieldset.panel_resizable.panel-preview table.quickLaungeContainer tr:nth-child(1) td:nth-child(3) div.quickLaunge a:nth-child(1) > img:nth-child(1)")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Timesheet"));
		
		driver.findElement(By.cssSelector("#menu_dashboard_index")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		String text = driver.findElement(By.cssSelector("#panel_resizable_1_0")).getText();
		System.out.println(text);
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		
	}
}
