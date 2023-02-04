package com.codenbox.Appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SetWifi extends Base{
	
	@Test
	public void setwifiTest() {
    
	// Locators: id, xpath, accessibilityId, classname, androidUIAutomator 
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		// xpath : //TagName[@attribute='value'] ; //tagName
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click(); //Uses the 2nd tagName of xpath
//		String wifiTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
//		Assert.assertEquals(wifiTitle, "WiFi settings"); //using assertion
//		
		driver.findElement(By.id("android:id/edit")).sendKeys("no1234");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		
	}

}
