package org.test.login1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginpageAirline {

	static WebDriver driver;

	@Given("The user should be in Airline login page")
	public void the_user_should_be_in_Airline_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.skytrans.com.au/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();	
	
	}

	@When("The user should enter the emailid and password")
	public void the_user_should_enter_the_emailid_and_password() throws InterruptedException {
		WebElement multiclick = driver.findElement(By.xpath("(//a[contains(text(),'Multi-City Trip')])[1]"));
		multiclick.click();
		boolean enabled = multiclick.isEnabled();
		System.out.println("-----Verify Multiclick button------" + enabled);
		Set<String> allid = driver.getWindowHandles();
		for (String eachid : allid) {
			driver.switchTo().window(eachid);
		}
		Thread.sleep(6000);
		WebElement ypclick = driver.findElement(By.xpath("//a[contains(text(),'Your Profile')]"));
		ypclick.click();
		boolean enabled2 = ypclick.isEnabled();
		System.out.println("-----Verify your profile button----" + enabled2);
		WebElement username = driver.findElement(By.id("txtPublicUserID"));
		username.sendKeys("Thilakbabu");
		boolean enabled3 = username.isEnabled();
		System.out.println("-----Verify the username test box--" + enabled3);
		WebElement password = driver.findElement(By.id("txtPublicUserPswd"));
		password.sendKeys("12365");
		boolean enabled4 = password.isEnabled();
		System.out.println("-----Verify the Password test box--" + enabled4);
	}

	@When("The user has to click the login button")
	public void the_user_has_to_click_the_login_button() throws InterruptedException {
		WebElement loginclick = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		loginclick.click();
		boolean enabled = loginclick.isEnabled();
		System.out.println("-----Verify the login button-------" + enabled);
		Thread.sleep(6000);
		WebElement ypclick1 = driver.findElement(By.xpath("//a[contains(text(),'Your Profile')]"));
		ypclick1.click();
		Thread.sleep(6000);
		WebElement takemessage = driver.findElement(By.xpath("//p[@class='ErrorMessage']"));
		String fullmessage = takemessage.getText();
		System.out.println(fullmessage);
		
		
		System.out.println("--------done-----------");
	
	}

	@Then("The user is in invalid page")
	public void the_user_is_in_invalid_page() {
		driver.quit();
	
	}


}
