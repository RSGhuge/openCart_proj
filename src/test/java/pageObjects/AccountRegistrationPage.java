package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Elemnet
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	
	@FindBy(css = "input[type='checkbox'][name='agree']")
	WebElement chkdPolicy;
	
	@FindBy(xpath = "//button[text()='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "h1[normilize-space()= 'Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Action Method
	public void setFirtsName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void setLastName(String LName) {
		lastName.sendKeys(LName);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassWord(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy() {
//		Actions act=new Actions(driver);
//		act.moveToElement(chkdPolicy).click().perform();
		chkdPolicy.submit();

	}

	public void clickContinue() {
		//sol1 
		btnContinue.click();
		
//		//sol2 
//		//btnContinue.submit();
//		
//		//sol3
//		Actions act=new Actions(driver);
//		act.moveToElement(btnContinue).click().perform();
//					
//		//sol4
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", btnContinue);
//		
//		//Sol 5
//		btnContinue.sendKeys(Keys.RETURN);
//		
//		//Sol6  
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
//		
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}

}
