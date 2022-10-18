package radhaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Baseclass.HelperClass;


public class Pompage extends HelperClass{

	public Pompage() {
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(id="lstOrigAP1")
	private WebElement place1;
	@FindBy(id="lstOrigAP2")
	private WebElement place2;
	@FindBy(id="lstOrigAP3")
	private WebElement place3;
	@FindBy(id="lstOrigAP4")
	private WebElement place4;
	@FindBy(id="lstOrigAP5")
	private WebElement place5;
	@FindBy(id="lstOrigAP6")
	private WebElement place6;
	@FindBy(id="lstOrigAP7")
	private WebElement place7;
	@FindBy(id="lstOrigAP8")
	private WebElement place8;
	@FindBy(id="lstOrigAP9")
	private WebElement place9;
	@FindBy(id="lstOrigAP10")
	private WebElement place10;
	 
	 
	 
	public WebElement getplace1() 
	{
	 return place1;
     }
	public WebElement getplace2() 
	{
	 return place2;
     }
	 
	public WebElement getplace3() 
	{
	 return place3;
     }
	public WebElement getplace4() 
	{
	 return place4;
     }
	public WebElement getplace5() 
	{
	 return place5;
     }
	public WebElement getplace6() 
	{
	 return place6;
     }
	public WebElement getplace7() 
	{
	 return place7;
     }
	public WebElement getplace8() 
	{
	 return place8;
     }
	public WebElement getplace9() 
	{
	 return place9;
     }
	public WebElement getplace10() 
	{
	 return place10;
     }
	public WebDriver getAllSelectedOptions() {
		// TODO Auto-generated method stub
		return null;
	}
	 
		
	}

		
 	


