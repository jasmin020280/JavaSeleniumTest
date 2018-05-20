package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import TestPages.BaseClass;
import TestPages.boaLandingPage;


public class UserAbleToSignInButtonAndValidateErrorMsg extends BaseClass {

	@Parameters ({"OnlineId","PassCode"})
		
		@Test
		public void userAbleToSignInButtonAndValidateErrorMsg(String OnlineId, String PassCode) throws InterruptedException {
		
		//1st option to read the data from data class
		//WebElement OnlineId = driver.findElement(By.xpath("//*[@id=\"onlineId1\"]"));
		/*boaLandingPage lp = new boaLandingPage(driver);
		lp.setOnlineId().sendKeys(GlobalData.OnlineId);
		lp.setPasscode().sendKeys(GlobalData.PassCode);
		lp.getSignIn().click();
		Thread.sleep(3000);*/
		
		//2nd option to read the data from data class
		//WebElement OnlineId = driver.findElement(By.xpath("//*[@id=\"onlineId1\"]"));
		boaLandingPage lp = new boaLandingPage(driver);

		lp.setOnlineId().sendKeys(OnlineId);
		lp.setPasscode().sendKeys(PassCode);
		
		lp.getSignIn().click();
		
		Thread.sleep(3000);
			
		String message = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[4]/div[2]/div/li")).getText();
		System.out.println(message);
		Thread.sleep(3000);

		}

/*		@Test
		public void userAbleToSignInButtonAndValidateErrorMsg1() throws InterruptedException {
		WebElement Passcode = driver.findElement(By.xpath("//*[@id=\"passcode1\"]"));
		Thread.sleep(3000);
		Passcode.sendKeys("123456");
		Thread.sleep(10000);
		}*/
/*		@Test
		public void userAbleToSignInButtonAndValidateErrorMsg11() throws InterruptedException {
		WebElement SignIn = driver.findElement(By.id("signIn"));
		SignIn.click();
		Thread.sleep(3000);
		}*/
		
/*		@Test
		public void userAbleToSignInButtonAndValidateErrorMsg111() throws InterruptedException {
		String message = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[4]/div[2]/div/li")).getText();
		System.out.println(message);
		Thread.sleep(3000);
		}*/

	}

