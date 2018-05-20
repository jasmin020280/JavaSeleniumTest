package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class boaLandingPage extends basePage {

	
	public boaLandingPage(WebDriver driver) {
		super(driver);
	}
 
	//WebElement OpenanAccount = driver.findElement(By.id("open"));
	@FindBy(id="open") public WebElement openanAccount;
	public WebElement getOpenanAccount() {
		return openanAccount;
		}
	
	//WebElement Getstarted = driver.findElement(By.id("Card_GetStarted_Expand_2017mOAA2RS"));
	@FindBy(id="Card_GetStarted_Expand_2017mOAA2RS") public WebElement getstarted;
	public WebElement getGetstarted() {
		return getstarted;
		}
	
	//WebElement ApplyNow = driver.findElement(By.id("carousel_apply_large_BANKAMERICARD"));
		@FindBy(id="carousel_apply_large_BANKAMERICARD") public WebElement ApplyNow;
		public WebElement getApplyNow() {
		return ApplyNow;
			}
		
		//WebElement OnlineId = driver.findElement(By.xpath("//*[@id=\"onlineId1\"]"));
		@FindBy(id="onlineId1") public WebElement OnlineId;
		public WebElement setOnlineId() {
		return OnlineId;
			}

		//WebElement Passcode = driver.findElement(By.xpath("//*[@id=\"passcode1\"]"));
		@FindBy(id="passcode1") public WebElement Passcode;
		public WebElement setPasscode() {
		return Passcode;
			}

		//WebElement SignIn = driver.findElement(By.id("signIn"));
		@FindBy(id="signIn") public WebElement SignIn;
		public WebElement getSignIn() {
		return SignIn;
			}

/*		//String Message = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[4]/div[2]/div/li")).getText();
		@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div[4]/div[2]/div/li") public WebElement Message;
		public WebElement getMessage() {
		return Message;
			}
*/
		
}
