package testCases;

import org.testng.annotations.Test;

import TestPages.BaseClass;
import TestPages.boaLandingPage;

public class ApplyForCreditCard extends BaseClass {

	@Test
	public void applyForCreditCard() throws InterruptedException {
	
	//WebElement OpenanAccount = driver.findElement(By.id("open"));
	boaLandingPage lp = new boaLandingPage(driver);
	lp.getOpenanAccount().click();
	//WebElement Getstarted = driver.findElement(By.id("Card_GetStarted_Expand_2017mOAA2RS"));
	lp.getGetstarted().click();
	Thread.sleep(2000);

	}
	
	@Test
	public void applyForCreditCard11() throws InterruptedException {

	//WebElement ApplyNow = driver.findElement(By.id("carousel_apply_large_BANKAMERICARD"));
	boaLandingPage lp = new boaLandingPage(driver);
	lp.getApplyNow().click();
	Thread.sleep(2000);
	}
		
}
