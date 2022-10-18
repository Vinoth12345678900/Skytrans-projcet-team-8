package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baseclass.HelperClass;
import io.cucumber.java.en.*;
public class Homepage extends HelperClass {
	    Homepagepom h;
@Given("The user should be in Booking page")
public void the_user_should_be_in_Booking_page() {
	
}
@When("The user should enter the Arrival and Departure Details")
public void the_user_should_enter_the_Arrival_and_Departure_Details() {
//	verify check box
	h =new Homepagepom();
	click(h.getCheckBox());
    Assert.assertEquals("verify checkbox","Return Date",h.getrDate().getText());
//  verify from countyname
    h.getFromCountry();
    Select s = new Select(h.getFromCountry());
    s.selectByIndex(3);
    Assert.assertEquals("verify from","Bamaga",s.getAllSelectedOptions().get(0).getText());
//  verify to country name
    h.getToCountry();
    Select s1 = new Select(h.getToCountry());
    s1.selectByIndex(6);
    Assert.assertEquals("verify to","Coconut Island",s1.getAllSelectedOptions().get(0).getText());
}
@When("The user should select the from and to date")
public void the_user_should_select_the_from_and_to_date() throws InterruptedException {
//  select from date 
      click(h.getFromDate());
	  sendkeys(h.getFromDate(),"19/10/2022");
      System.out.println(h.getFromDate().getAttribute("value").contains("19/10/2023"));
//    select to date
      click(h.getToDate());
      sendkeys(h.getTooDate(),"20/10/2022");
      System.out.println(h.getTooDate().getAttribute("value").contains("20/10/2022"));
}

@Then("The user should be next page")
public void the_user_should_be_next_page() {
	click(h.getContinuebtn());
	System.out.println(h.getContinuebtn().isEnabled());
    click(h.getContinuebtn());
}
@Given("The user should be in flight search page")
public void the_user_should_be_in_flight_search_page() {
	
}

@When("The user should be check the whether the data is present or not")
public void the_user_should_be_check_the_whether_the_data_is_present_or_not() {

   /* WebElement origin = driver.findElement(By.xpath("//*[text()=' Bamaga (ABM) ']"));
    String attribute = origin.getText();
    System.out.println(attribute);
    WebElement destination = driver.findElement(By.xpath("//*[text()=' Coconut Island (CNC) ']"));
    WebElement ddate = driver.findElement(By.name("dateRange"));
    WebElement onewaybtn = driver.findElement(By.xpath("//*[text()=' One Way ']"));
    WebElement returnbtn = driver.findElement(By.xpath("//*[text()=' Return ']"));
    WebElement adults = driver.findElement(By.xpath("//*[text()='Adults ']"));
    WebElement children = driver.findElement(By.xpath("//*[text()='Children ']"));
    WebElement infants = driver.findElement(By.xpath("//*[text()='Infants ']"));
    WebElement promocode = driver.findElement(By.id("promoCode"));
    WebElement findfligh = driver.findElement(By.xpath("//*[text()='Find Flights']"));
	*/
}

@Then("The user should be in select flight page")
public void the_user_should_be_in_select_flight_page() {
}
    


}
