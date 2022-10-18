package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import Baseclass.HelperClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class Hooks extends HelperClass {
	@Before
	public void beforescenario() {
		System.out.println("----before scenario---");
		chromebrowser();
		urllaunch("https://www.skytrans.com.au/");
		time(20);
		maximize();        
	}
	  @After
      public void afterscenario(Scenario sc) throws IOException {
           System.out.println("-----after scenario-----");
           String name = sc.getName();
           TakesScreenshot tk =(TakesScreenshot)driver; 
           byte[] src = tk.getScreenshotAs(OutputType.BYTES);
	       sc.embed(src,"image/png");
      
      }
}
