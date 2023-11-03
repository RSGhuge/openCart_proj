package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test(groups= {"Regression","Master"})
	public void test_account_Registration() {
		
		logger.debug("application logs......");
		logger.info("***  Starting TC_001_AccountRegistrationTest ***");
		try {
			HomePage hp = new HomePage(driver);
			hp.ClickMyaccount();
			logger.info("Clicked on My account link");
			hp.ClickRegister();
			logger.info("Clicked on register link");
			
			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			logger.info("Providing customer data");
			regpage.setFirtsName(randomeString().toUpperCase());
			regpage.setLastName(randomeString().toUpperCase());
			regpage.setEmail(randomeString()+"@gmail.com");
			
			String password=randomAlphaNumeric();
			regpage.setPassWord(password);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			regpage.setPrivacyPolicy();
			//regpage.clickContinue();
			logger.info("Clicked on continue");
			
			String confmsg = regpage.getConfirmationMsg();
			
			logger.info("Validating expected message");
			Assert.assertEquals(confmsg, "Your Account Has Been Created!","Test failed");
			//Assert.assertEquals("Your Account Has Been Created!", "Your Accou Has Been Created!", "Test failed");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");
		
	}
}
