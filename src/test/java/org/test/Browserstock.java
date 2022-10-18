package org.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserstock {
	static String username="strvinoth";
	   static String password="jW1adpnKJDYv9xMoMCRs";
	   static String url="https://"+username+":"+password+"@hub-cloud.browserstack.com/wd/hub)";
	   
   public static void main(String[] args) throws MalformedURLException {
	   MutableCapabilities capabilities = new MutableCapabilities();
	   capabilities.setCapability("browserName", "Chrome");
	   capabilities.setCapability("browserVersion", "latest");
	   HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
	   browserstackOptions.put("os", "Windows");
	   browserstackOptions.put("osVersion", "11");
	   browserstackOptions.put("projectName", "skytrans");
	   browserstackOptions.put("buildName", "first build");
	   browserstackOptions.put("local", "false");
	   browserstackOptions.put("seleniumVersion", "3.141.59");
	   capabilities.setCapability("bstack:options", browserstackOptions);

	   
	   RemoteWebDriver driver= new RemoteWebDriver(new URL(url),capabilities);
	   driver.get("https://www.facebook.com/");
	   WebElement user = driver.findElement(By.id("email"));
	   user.sendKeys("vinoth");
	   WebElement pass = driver.findElement(By.id("pass"));
       pass.sendKeys("98765");
       driver.quit();
   
   }

}
