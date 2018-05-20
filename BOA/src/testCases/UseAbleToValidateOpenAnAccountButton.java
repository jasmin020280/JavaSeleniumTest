package testCases;

import org.testng.annotations.Test;
import TestPages.BaseClass;
import TestPages.boaLandingPage;

public class UseAbleToValidateOpenAnAccountButton extends BaseClass {
	
		@Test
		public void useAbleToValidateOpenAnAccountButton() throws InterruptedException {
		
		//WebElement OpenanAccount = driver.findElement(By.id("open"));
		boaLandingPage lp = new boaLandingPage(driver);
		lp.getOpenanAccount().click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		}
			
	}
