package com.codenbox.Appium;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemoTest extends Base {
	
	
	@Test
	public void scrollTest() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		
		//scroll until view an element
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		scrollToElement("WebView");
		
		// scroll as long as the App has elements
		
		scrollToEnd();


		
	}

}
