package com.codenbox.Appium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GeneralStoreTest extends Base{
	@Test
	public void doHybrid() throws InterruptedException {
		
		//Scroll and select Canada option from dropDown
   	 driver.findElement(By.id("android:id/text1")).click();
   	 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Canada\"));"));
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Canada']")).click();

	//Type name in a text field
		  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Jeniffer");
		  driver.hideKeyboard(); // hide keyboard

  //Select radio option
		  driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		  
   // scroll until Air jordan 9
		  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));"));
		  
         int count=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
         for(int i=0; i<count; i++) {
        	 String productName=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
        	    if(productName.equalsIgnoreCase("Air Jordan 9 Retro")) {
        	    	driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
        	    	
        	    }
         }
         
         driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
         Thread.sleep(2000l);
         driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
         Thread.sleep(6000l);
         Set<String>s=driver.getContextHandles();
         for (String ContextName: s){
        	 System.out.println(ContextName); //Will print the name of both Native and WebView ContextId 

         }
         //pass the WebView name
         driver.context("WEBVIEW_com.androidsample.generalstore");
         Thread.sleep(6000l);
         driver.findElement(By.name("q")).sendKeys("codenbox");
         driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
         Thread.sleep(2000l);
         driver.pressKey(new KeyEvent(AndroidKey.BACK));
         Thread.sleep(2000l);
         driver.context("NATIVE_APP"); //pass the Native App Name

         
         
         
		
	}

}
