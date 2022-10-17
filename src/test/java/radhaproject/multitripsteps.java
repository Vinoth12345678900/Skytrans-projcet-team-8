package radhaproject;

import org.openqa.selenium.support.ui.Select;

import Baseclass.HelperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class multitripsteps extends HelperClass{
	//static WebDriver driver;
	 

	 
	@Given("click mutitrip page")
	public void click_mutitrip_page(){
		browserlanuch("chrome");
		brow
		UrlLanuch("https://book.skytrans.com.au/MultiCitySelect.aspx"); 
		maximize();
		implicitwait(20);
	
	    
	         
	}
	  

	 
	@When("usershould in select a arrival place")
	public void usershould_in_select_a_arrival_place() {
		 Pompage s=new Pompage();
		 
		 s.getplace1();
		 Select p1 = new Select(s.getplace1());
		 p1.selectByIndex(1);
		    
		 s.getplace2();
			Select p2 = new Select(s.getplace2());
			 p2.selectByIndex(2);
			 
			 s.getplace3();
				Select p3 = new Select(s.getplace3());
				 p3.selectByIndex(3);
				 
				 s.getplace4();
					Select p4 = new Select(s.getplace4());
					 p4.selectByIndex(4);
					 
					 s.getplace5();
						Select p5 = new Select(s.getplace5());
						 p5.selectByIndex(5);
						 
						 s.getplace6();
							Select p6 = new Select(s.getplace6());
							 p6.selectByIndex(6);
					           
							 
							 s.getplace7();
								Select p7= new Select(s.getplace7());
								 p7.selectByIndex(7);
								 
								 s.getplace8();
									Select p8 = new Select(s.getplace8());
									 p8.selectByIndex(8);
									 
									 
									s.getplace9();
                                      Select p9 = new Select(s.getplace9());
										p9.selectByIndex(1);
								           
										s.getplace10();
										Select p10 = new Select(s.getplace10());
											p10.selectByIndex(10);
									           
							           
           
		
						           
				          
			           
		           
	           
	  	
  
	}
	@When("usershould in select depature place")
	public void usershould_in_select_depature_place() throws InterruptedException {
 Pompage2 s=new Pompage2();
		 
		 s.getplace1();
		 Select p1 = new Select(s.getplace1());
		 p1.selectByIndex(1);
		 
		 s.getplace2();
			Select p2 = new Select(s.getplace2());
			 p2.selectByIndex(2);
			 
			 s.getplace3();
				Select p3 = new Select(s.getplace3());
				 p3.selectByIndex(3);
				 
				 s.getplace4();
					Select p4 = new Select(s.getplace4());
					 p4.selectByIndex(4);
					 
					 s.getplace5();
						Select p5 = new Select(s.getplace5());
						 p5.selectByIndex(5);
						 
						 s.getplace6();
							Select p6 = new Select(s.getplace6());
							 p6.selectByIndex(1);
					           
							 
							 s.getplace7();
								Select p7= new Select(s.getplace7());
								 p7.selectByIndex(7);
								 
								 s.getplace8();
									Select p8 = new Select(s.getplace8());
									 p8.selectByIndex(8);
									 
									 Thread.sleep(2000);
									 s.getplace9();
										Select p9 = new Select(s.getplace9());
												p9.getFirstSelectedOption();					
										 
								           
										 s.getplace10();
											Select p10 = new Select(s.getplace10());
											 p10.getFirstSelectedOption();					       
	}           
		           
	           
	  	
		 
	
	@When("usershould in select a date")
	public void usershould_in_select_a_date() throws InterruptedException {
		Pompage3 s=new Pompage3();
		s.getdates1().click();
		Thread.sleep(2000);
		s.getdate1().click();Thread.sleep(2000);
		
		s.getdates2().click();
		s.getdate2().click();Thread.sleep(2000);
		
		s.getdates3().click();
		s.getdate3().click();Thread.sleep(2000);
		
		s.getdates4().click();
		s.getdate4().click();Thread.sleep(2000);
		
		s.getdates5().click();
		s.getdate5().click();Thread.sleep(2000);
		
		s.getdates6().click();
		s.getdate6().click();Thread.sleep(2000);
		
		s.getdates7().click();
		s.getdate7().click();Thread.sleep(2000);
		
		s.getdates8().click();
		s.getdate8().click();Thread.sleep(2000);
		
		s.getdates9().click();
		s.getdate9().click();Thread.sleep(2000);
		
		s.getdates10().click();
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
