package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class basePage {
	
	public WebDriver driver;
	
	public basePage(WebDriver driver){
		this.driver = driver;
		this.initElement();
	}
	
	public void initElement() {
		PageFactory.initElements(driver, this);
				
	}
}
