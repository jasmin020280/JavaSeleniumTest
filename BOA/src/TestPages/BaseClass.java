package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver; 

	@BeforeClass
	public void beforeClass() {
	String baseDir = System.getProperty("user.dir");
	String geckopath = baseDir + "\\driver\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver", geckopath);

	driver = new FirefoxDriver();
	
	}
	
	@BeforeMethod
	public void beforetest() throws InterruptedException {
	driver.get("https://www.bankofamerica.com/");
	driver.manage().window().maximize();	
	Thread.sleep(5000);
	}
		
	@AfterMethod
	public void afterMethod() {
	System.out.println("Test case is pass");
	}
	
	@AfterClass
	public void afterClass() {
	driver.close();
	}
	
}