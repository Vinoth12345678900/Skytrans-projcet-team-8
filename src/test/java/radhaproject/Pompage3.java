package radhaproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;


public class Pompage3 extends Baseclass{
	public Pompage3() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='departure1']")
	private WebElement dates1;
	@FindBy(xpath="//a[text()='19']")
	private WebElement date1;
	@FindBy(xpath="//input[@id='departure2']")
	private WebElement dates2;
	@FindBy(xpath="//a[text()='19']")
	private WebElement date2;
	@FindBy(xpath="//input[@id='departure3']")
	private WebElement dates3;
	@FindBy(xpath="//a[text()='19']")
	private WebElement date3;
	@FindBy(xpath="//input[@id='departure4']")
	private WebElement dates4;
	@FindBy(xpath="//a[text()='19']")
	private WebElement date4;
	@FindBy(xpath="//input[@id='departure5']")
	private WebElement dates5;
	@FindBy(xpath="//a[text()='19']")
	private WebElement date5;
	@FindBy(xpath="//input[@id='departure6']")
	private WebElement dates6;
	@FindBy(xpath="//a[text()='20']")
	private WebElement date6;
	@FindBy(xpath="//input[@id='departure7']")
	private WebElement dates7;
	@FindBy(xpath="//a[text()='21']")
	private WebElement date7;
	@FindBy(xpath="//input[@id='departure8']")
	private WebElement dates8;
	@FindBy(xpath="//a[text()='22']")
	private WebElement date8;
	@FindBy(xpath="//input[@id='departure9']")
	private WebElement dates9;
	@FindBy(xpath="//a[text()='23']")
	private WebElement date9;
	@FindBy(xpath="//input[@id='departure10']")
	private WebElement dates10;
	@FindBy(xpath="//a[text()='24']")
	private WebElement date10;
	
	@FindBy(xpath="//input[@id='txtNumAdults']")
	private WebElement Adults;
	@FindBy(xpath="//input[@id='txtNumChildren']")
	private WebElement Children;
	@FindBy(xpath="//input[@id='txtNumInfants']")
	private WebElement Infants;
	@FindBy(xpath="//input[@id='txtPromoCode']")
	private WebElement code;
		    	
		    	   	
	 
	public WebElement getdates1() 
	{
	 return dates1;
     } 
	public WebElement getdate1() 
	{
	 return date1;
	}
	 public WebElement getdates2() 
		{
		 return dates2;
	     } 
		public WebElement getdate2() 
		{
		 return date2;
	     } 
		public WebElement getdates3() 
		{
		 return dates3;
	     } 
		public WebElement getdate3() 
		{
		 return date3;
	     } 
		public WebElement getdates4() 
		{
		 return dates4;
	     } 
		public WebElement getdate4() 
		{
		 return date4;
	     } 
		public WebElement getdates5() 
		{
		 return dates5;
	     } 
		public WebElement getdate5() 
		{
		 return date5;
	     } 
		public WebElement getdates6() 
		{
		 return dates6;
	     } 
		public WebElement getdate6() 
		{
		 return date6;
	     } 
		public WebElement getdates7() 
		{
		 return dates7;
	     } 
		public WebElement getdate7() 
		{
		 return date7;
	     } 
		public WebElement getdates8() 
		{
		 return dates8;
	     } 
		public WebElement getdate8() 
		{
		 return date8;
	     } 
		
		public WebElement getdates9() 
		{
		 return dates9;
	     } 
		public WebElement getdate9() 
		{
		 return date9;
	     } 
		public WebElement getdates10() 
		{
		 return dates10;
	     } 
		public WebElement getdate10() 
		{
		 return date10;
	     } 
		public WebElement getAdults() 
		{
		 return Adults;
	     } 
		
		public WebElement getChildren() 
		{
		 return Children;
	     } 
		public WebElement getInfants() 
		{
		 return Infants;
	     } 
		public WebElement getcode() 
		{
		 return code;
	     } 
		
		
		 	
		
     } 
	


