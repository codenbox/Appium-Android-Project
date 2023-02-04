package com.codenbox.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Swipe extends Base{
	
	@Test
	public void swipeDemoTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();
		
		WebElement firstImage=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
	// Before perform the swipe	
		String firstTimeValue=firstImage.getAttribute("focusable");
		Assert.assertEquals("true", firstTimeValue);
		
	//perform swipe action
		swipeAction(firstImage, "left");
		
		
	// After perform the swipe	
				String secondTimeValue=firstImage.getAttribute("focusable");
				Assert.assertEquals("false", secondTimeValue);
				
		
	}
	

}
