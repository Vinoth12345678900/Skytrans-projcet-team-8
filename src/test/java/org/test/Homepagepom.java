package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.HelperClass;

public class Homepagepom extends HelperClass {
	public Homepagepom() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="chkRoundTrip")
    private WebElement checkBox;
	@FindBy(xpath="(//label[text()='Return Date'])[1]")
    private WebElement rDate;
	@FindBy(id="lstOrigAP")
    private WebElement fromCountry;
	@FindBy(id="lstDestAP")
    private WebElement toCountry;
	@FindBy(id="departure")
    private WebElement fromDate;
	@FindBy(xpath="(//a[@class='ui-state-default'])[9]")
    private WebElement toDate;
	@FindBy(id="arrival")
    private WebElement tooDate;
	@FindBy(xpath="(//button[@type='submit'])[1]")
    private WebElement continuebtn;
    
    
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getrDate() {
		return rDate;
	}
	public WebElement getFromCountry() {
		return fromCountry;
	}
	public WebElement getToCountry() {
		return toCountry;
	}
	public WebElement getFromDate() {
		return fromDate;
	}
	public WebElement getToDate() {
		return toDate;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	public WebElement getTooDate() {
		return tooDate;
	}
    
}
