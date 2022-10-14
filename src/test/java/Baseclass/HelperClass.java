package Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.QuietException;
import io.github.bonigarcia.wdm.WebDriverManager;

public  class HelperClass  {
	
	public static WebDriver driver;
//	1.BROWSER LAUNCH
	public static WebDriver browserlaunch1(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	    }
//	1.BROWSER LAUNCH
	public static  WebDriver browserlaunch(String browsername) {
		switch(browsername) {
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		case"edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
		case "firefox":
	    WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;	
		}
		return driver;
	}
//	1.BROWSER LAUNCH
	public static WebDriver chromebrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 return driver;
	}
	public static WebDriver firefoxbrowser() {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 return driver;
    }
	public static WebDriver edgebrowser() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 return driver;
    }
	
//	2.URL LAUNCH
	public static void urllaunch(String url) {
         driver.get(url);		
         }
//	3.QUIT
	public static void quit() {
		driver.quit();
	}
//	4.SENDKEYS
    public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
    } 
//  5.  CLICK
    public static void click(WebElement e) {
		e.click();
	}
//  6.GET CURRENT URL
	public static String currenturl() {
		String currenturl = driver.getCurrentUrl();
		return currenturl;
	}
//	7.GET CURRENT TITLE
	public static String title() {
		String title = driver.getTitle();
		return title;
	}
//	8.GET ATTRIBUE
	public static String getattribute(WebElement e) {
		String att = e.getAttribute("value");
		return att;
	}
//	Get Attributes
	public static String getattributes(WebElement e) {
		String attribute = e.getAttribute("inneText");
		return attribute;
	}
//	9.SELECT BY INDEX
	public static void selectbyindex(WebElement e,int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
//	10.RIGHT CLICK
	public static void rightclick(WebElement target) {
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
	}
//	11.DOUBLE CLICK
	public static void doubleclick(WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
	}
//	12.SELECT BY VALUE
	private void selectbyvalue(WebElement e,String value) {
	Select s = new Select(e);
	s.selectByValue(value);
}
//	13.MAXIMIZE
	 public static void maximize() {
		 driver.manage().window().maximize();
	   }
//	14.IMPLICITLYWAIT
		public static void time(long secs) {
			driver.manage().timeouts().implicitlyWait(secs,TimeUnit.SECONDS);
	     }
//  15.GET TEXT
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
//	16.STATI WAIT 
	public static void threadsleep(long millis)throws InterruptedException {
		Thread.sleep(millis);	
    }
//	ACTIONS
//	17.MOVE TO EMEMENT
	public static void movetoelement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}
//	18.Drag and Drop
	public static void draganddrop(WebElement src,WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
//	19.Click And Hold
	public static void clickandhold(WebElement src,WebElement des) {
		Actions a = new Actions(driver);
		a.clickAndHold(src).release(des).perform();
	}
//	20.Clear
	public static void Clear(WebElement e) {
		e.clear();
		}
//	21.Copy text
	public static void copytext(WebElement e)throws AWTException{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
	}
//	22.Past Text
	public static void pastetext(WebElement e)throws AWTException{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
	}
//	23.Select by Text
	public static void selectbyvisibletext(WebElement e,int value) {
	Select s = new Select(e);
	s.selectByIndex(value);
	}
//	24.First Selected Option
	public static void firstselectedoption(WebElement e) {
		Select s = new Select(e);
		s.getFirstSelectedOption();
	}
//	25. Deselected by index
	public static void deselectedbyindex(WebElement e,int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);
    }
//	26.deselcted by value
	public static void deselectedbyvalue(WebElement e,String value) {
		Select s = new Select(e);
        s.deselectByValue(value);
	}
//	27.deselectbytext
	public static void desselectbyvisibletext(WebElement e,String value) {
		Select s = new Select(e);
		s.deselectByVisibleText(value);

	}
//	28.DeSelectAll
	public static void deselectall(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}
//	29.Take ScreeenShot
	public static void takescreenshot(String name) {
		TakesScreenshot tk =(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\strvi\\eclipse-workspace\\Maveninstalation1Day\\src\\test\\java");
	}
//	30.Switch to Frame index
	public static void frameindex(int index) {
		driver.switchTo().frame(index);
	}
//	31.Switch to ID or Name
	public static void switchtoidornme(int index) {
		driver.switchTo().frame(index);
    }
	public static void frame(WebElement e) {
		driver.switchTo().frame(e);
	}
//	32.Switch out from frame
	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}
//	33.Switch Out from frame one by one
	public static void parentframe() {
		driver.switchTo().parentFrame();
	}
//	34.Window handle
	public static String windowhandle() {
		String switchto = driver.getWindowHandle();
		return switchto;
	}
//	35.Navigate Back
	public static void navigateback() {
		driver.navigate().back();
	}
//	36.NavigateForward
	public static void navigateforward() {
		driver.navigate().forward();
    }
//	37.Navigate Refresh
	public static void navigaterefresh() {
		driver.navigate().refresh();
    }
//	38.Alert
	public static Alert alert() {
		Alert alert = driver.switchTo().alert();
		return alert;
    }
//	39.Accept Alert
	public static Alert acceptalert() {
		Alert alert = driver.switchTo().alert();
        alert.accept();
		return alert;	
	}
//	40.Dismiss Alert
	public static Alert dismissalert() {
		Alert alert = driver.switchTo().alert();
	    alert.dismiss();
		return alert;
	}
//	41.Window Handle
	public static void Windowhandling() {
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for(String eachid:windowHandles) {
				if(!windowHandle.equals(eachid)) {
					driver.switchTo().window(eachid);
				}
			}

	}
	
	
	public static String getExcelData(String filename,String Sheetname,int rowno,int cellno) throws IOException {
//		File
		
		File loc = new File("C:\\Users\\strvi\\eclipse-workspace\\TestngClass\\src\\test\\resources\\"+filename+".xlsx");
//		Format
		
		FileInputStream fi = new FileInputStream(loc);
		
//		WorBook
		Workbook w = new XSSFWorkbook(fi);
//		Sheet
		Sheet s = w.getSheet(Sheetname);
//		Row
		Row r = s.getRow(rowno);
//		Cell
		Cell cell = r.getCell(cellno);
//		Celltype
		int type = cell.getCellType();
		 String value =null;
		if(type==1) {
			value = cell.getStringCellValue();
		}else {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
				 value = sf.format(date);
				
			}else {
				double db = cell.getNumericCellValue();
		         long num = (long)db;
		         value = String.valueOf(num);
			}
		}
		return value;
		
		

	}
	
//	ScreenShot
	     private void screenshot(String name) throws IOException {
			 TakesScreenshot tk=(TakesScreenshot)driver;
			 File src = tk.getScreenshotAs(OutputType.FILE);
             File des = new File(System.getProperty("user.dir")+"src\\test\\resources"+name+".png");
             FileUtils.copyFile(src, des);
	     }
//     JavaScript	
	     private void js(String name,WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("argument[0].setAttribute('value','"+name+"')", e);

		}
	
}