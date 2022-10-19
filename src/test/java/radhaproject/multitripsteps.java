package radhaproject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import radhaproject.Pompage;
import radhaproject.Pompage2;
import radhaproject.Pompage3;

import Baseclass.HelperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.io.Helpers;

public class multitripsteps extends HelperClass{
	//static WebDriver driver;
	 

	 
	 
	@Given("click mutitrip page")
	public void click_mutitrip_page(){
		chromebrowser();
		urllaunch("https://book.skytrans.com.au/MultiCitySelect.aspx"); 
		time(20);
		maximize();
	
		
		 
	    
	         
	}
	  

	 
	@When("usershould in select a arrival place")
	public void usershould_in_select_a_arrival_place() {
		 Pompage s=new Pompage();
		 
		    
		 s.getplace1();
		 Select p1 = new Select(s.getplace1());
		 List<WebElement> options = p1.getOptions();
		 WebElement l=options.get(1);
		 String text = l.getText();
		  Assert.assertEquals("verify from","Aurukun",text);
		 p1.selectByIndex(1);
		 
			 
		     
		    
		 s.getplace2();
			Select p2 = new Select(s.getplace2());
			 WebElement l1=options.get(1);
			 String text1 = l1.getText();
			  Assert.assertEquals("verify from","Aurukun",text1);
			 p2.selectByIndex(2);
			  
			 
			 s.getplace3();
				Select p3 = new Select(s.getplace3());
				WebElement l2=options.get(4);
				 String text2 = l2.getText();
				  Assert.assertEquals("verify from","Boigu Island",text2);
				 p3.selectByIndex(4);
				 
				 s.getplace4();
					Select p4 = new Select(s.getplace4());
					WebElement l3=options.get(4);
					 String text3 = l3.getText();
					  Assert.assertEquals("verify from","Boigu Island",text3);
					 p4.selectByIndex(4);
					 
					 s.getplace5();
						Select p5 = new Select(s.getplace5());
						WebElement l4=options.get(4);
						 String text4 = l4.getText();
						  Assert.assertEquals("verify from","Boigu Island",text4);
						 p5.selectByIndex(5);
						 
						 s.getplace6();
							Select p6 = new Select(s.getplace6());
							WebElement l5=options.get(4);
							 String text5 = l5.getText();
							  Assert.assertEquals("verify from","Boigu Island",text5);
							 p6.selectByIndex(6);
					           
							 
							 s.getplace7();
								Select p7= new Select(s.getplace7());
								WebElement l6=options.get(4);
								 String text6 = l6.getText();
								  Assert.assertEquals("verify from","Boigu Island",text6);
								 p7.selectByIndex(7);
								 
								 s.getplace8();
									Select p8 = new Select(s.getplace8());
									WebElement l7=options.get(4);
									 String text7 = l7.getText();
									  Assert.assertEquals("verify from","Boigu Island",text7);
									 p8.selectByIndex(8);
									 
									 
									s.getplace9();
                                     Select p9 = new Select(s.getplace9());
                                     WebElement l8=options.get(4);
                    				 String text8 = l8.getText();
                    				  Assert.assertEquals("verify from","Boigu Island",text8);
										p9.selectByIndex(1);
								           
										s.getplace10();
										Select p10 = new Select(s.getplace10());
										WebElement l9=options.get(2);
										 String text9 = l9.getText();
										  Assert.assertEquals("verify from","Aurukun",text);
											p10.selectByIndex(10);
									           
							           
          
		
						           
				          
			           
		           
	           
	  	
 
	}
	@When("usershould in select depature place")
	public void usershould_in_select_depature_place() throws InterruptedException {
Pompage2 s=new Pompage2();
		 
		 s.getplace1();
		 Select p1 = new Select(s.getplace1());
		 List<WebElement> options = p1.getOptions();
		 WebElement l=options.get(2);
		 String text = l.getText();
		  Assert.assertEquals("verify from","Cairns",text);
		 p1.selectByIndex(1);
		 
		 s.getplace2();
			Select p2 = new Select(s.getplace2());
			 WebElement l1=options.get(3);
			 String text1 = l1.getText();
			  Assert.assertEquals("verify from","Horn Island",text1);
			 p2.selectByIndex(2);
			 
			 s.getplace3();
				Select p3 = new Select(s.getplace3());
				WebElement l2=options.get(4);
				  String text2 = l2.getText();
				  Assert.assertEquals("verify from","Horn Island",text1);
			 p3.selectByIndex(3);
				 
				 s.getplace4();
					Select p4 = new Select(s.getplace4());
					 WebElement l3=options.get(1);
					 String t3 = l3.getText();
					 Assert.assertEquals("verify from","Bamaga",t3);
					 p4.selectByIndex(4);
					 
					 s.getplace5();
						Select p5 = new Select(s.getplace5());
						  WebElement l4=options.get(5);
						 String t4 = l4.getText();
						 Assert.assertEquals("verify from","Lockhart River",t4);
						 p5.selectByIndex(5);
						 
						 s.getplace6();
							Select p6 = new Select(s.getplace6());
							  WebElement l5=options.get(1);
							 String t5 = l5.getText();
							  Assert.assertEquals("verify from","Bamaga",t5);
							 p6.selectByIndex(1);
					           
							 
							 s.getplace7();
							 Select p7 = new Select(s.getplace8());
							   WebElement l6=options.get(1);
								 String t6 = l6.getText();
								 Assert.assertEquals("verify from","Bamaga",t6);
								 p7.selectByIndex(4);
								 
								 s.getplace8();
									Select p8 = new Select(s.getplace8());
									 WebElement l7=options.get(1);
									 String t7 = l7.getText();
									 Assert.assertEquals("verify from","Bamaga",t7);
									 p8.selectByIndex(8);
									 
									 
									 s.getplace9();
										Select p9 = new Select(s.getplace9());
										WebElement l8=options.get(1);
												 String t8 = l.getText();
												 Assert.assertEquals("verify from","Cairns",t8);
								           p9.selectByIndex(1);
								           
								           
										 s.getplace10();
											Select p10 = new Select(s.getplace10());
										     WebElement l9=options.get(1);
											 String t9 = l9.getText();
											 Assert.assertEquals("verify from","Bamaga",t9);
											 p10.selectByIndex(2);
	}           
		           
	           
	  	
		 
	
	@When("usershould in select a date")
	public void usershould_in_select_a_date() throws InterruptedException {
		Pompage3 s=new Pompage3();
		s.getdates1().click();
		boolean enabled = s.getdates1().isEnabled();
		Assert.assertTrue(enabled);
		Thread.sleep(2000);
		s.getdate1().click();
		  Thread.sleep(2000);
		
		s.getdates2().click();
		boolean enabled2 = s.getdates2().isEnabled();
		Assert.assertTrue(enabled2);
		s.getdate2().click();Thread.sleep(2000);
		
		s.getdates3().click();
		boolean enabled3 = s.getdates3().isEnabled();
		Assert.assertTrue(enabled3);
		s.getdate3().click();Thread.sleep(2000);
		
		s.getdates4().click();
		boolean enabled4 = s.getdates4().isEnabled();
		Assert.assertTrue(enabled4);
		s.getdate4().click();Thread.sleep(2000);
		
		s.getdates5().click();
		boolean enabled5 = s.getdates5().isEnabled();
		Assert.assertTrue(enabled5);
		s.getdate5().click();Thread.sleep(2000);
		
		s.getdates6().click();
		boolean enabled6 = s.getdates6().isEnabled();
		Assert.assertTrue(enabled6);
		s.getdate6().click();Thread.sleep(2000);
		
		s.getdates7().click();
		boolean enabled7 = s.getdates7().isEnabled();
		Assert.assertTrue(enabled7);
		s.getdate7().click();Thread.sleep(2000);
		
		s.getdates8().click();
		boolean enabled8 = s.getdates8().isEnabled();
		Assert.assertTrue(enabled8);
		s.getdate8().click();Thread.sleep(2000);
		
		s.getdates9().click();
		boolean enabled9 = s.getdates9().isEnabled();
		Assert.assertTrue(enabled9);
		s.getdate9().click();Thread.sleep(2000);
		
		s.getdates10().click();
		boolean enabled10 = s.getdates10().isEnabled();
		Assert.assertTrue(enabled10);
		s.getdate10().click();Thread.sleep(2000);
		s.getAdults().sendKeys("2");
		s.getChildren().sendKeys("2");
		s.getInfants().sendKeys("1");
		s.getcode().sendKeys("122");
		
		
	                   
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	     
	}


}