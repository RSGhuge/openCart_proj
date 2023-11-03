package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Elements
	@FindBy(xpath= "//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText = "Register")
	WebElement lnkRegister;
 
	@FindBy(linkText = "Login")
	WebElement lnlLogin;
	
	//Action Methods
	public void ClickMyaccount(){
		lnkMyaccount.click();
	}
	
	public void ClickRegister(){
		lnkRegister.click();
	}
	
	public void ClickLogin(){
		lnlLogin.click();
	}

}
