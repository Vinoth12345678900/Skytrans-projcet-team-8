package org.test;


import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vinoth {
	WebDriver driver;
	@BeforeTest
	private void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.skytrans.com.au");
		driver.manage().window().maximize();
	}
	@Test
	private void test1() throws InterruptedException {
//		verify check box
	    WebElement checkbox = driver.findElement(By.id("chkRoundTrip"));
        checkbox.click();
        WebElement rdate = driver.findElement(By.xpath("(//label[text()='Return Date'])[1]"));
	    String text = rdate.getText();
	    Assert.assertEquals("verify checkbox","Return Date",text);
	
//	    verify from countyname
	    
	    WebElement from = driver.findElement(By.id("lstOrigAP"));
	    Select s = new Select(from);
	    s.selectByIndex(3);
	    List<WebElement> all = s.getAllSelectedOptions();
	    WebElement webElement = all.get(0);
	    String text2 = webElement.getText();
	    Assert.assertEquals("verify from","Bamaga",text2);
	    
//	    verify to country name
	    
	    WebElement to = driver.findElement(By.id("lstDestAP"));
	    Select s1 = new Select(to);
	    s1.selectByIndex(2);
	    List<WebElement> allto = s.getAllSelectedOptions();
	    WebElement webElement2 = allto.get(0);
	    String text3 = webElement2.getText();
	    Assert.assertEquals("verify to","Bamaga",text3);
//	    select from date
	    Thread.sleep(3000);
	    WebElement fromdate = driver.findElement(By.id("departure"));
	    fromdate.click();
//	    WebElement fromdate1 = driver.findElement(By.id("(//a[@class='ui-state-default'])[23]"));
//	    fromdate1.click();
	    fromdate.sendKeys("19/10/2022");
	    String date = fromdate.getAttribute("value");
	    System.out.println(date);
        boolean contains = date.contains("19/10/2023");
        System.out.println(contains);
	    
//	    select to date
	    WebElement selectdate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[9]"));
		selectdate.click();
		WebElement todate = driver.findElement(By.id("arrival"));
		todate.sendKeys("20/10/2022");
		String too = todate.getAttribute("value");
		System.out.println(too);
		boolean contains2 = too.contains("20/10/2022");
		System.out.println(contains2);
		
//		WebElement selectdate1 = driver.findElement(By.id("(//a[@class='ui-state-default'])[20]"));
//		selectdate1.click();
//		click continue button
		WebElement continuebtn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		continuebtn.click();
		boolean enabled = continuebtn.isEnabled();
		System.out.println(enabled);
		continuebtn.click();
		
		
		
	}
	 @AfterClass
	  private void test2() {
//		driver.quit();

	}
}
