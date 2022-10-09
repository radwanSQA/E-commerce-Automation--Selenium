package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.CheckoutProcess;
import pages.CreateAnAccountPage;
import pages.HomePage;

public class AccountCreate extends BaseDriver{
	
	
	
	@BeforeClass
     public void startUrl() {
    	 PageDriver.getCurrentDriver().get(baseURL);
    	 PageDriver.getCurrentDriver().manage().window().maximize();
		
	}
	
	@Test
	public void createAnAccount() {
		HomePage homePage = new HomePage();
		homePage.clickOnSignIn();
		homePage.sendEmail();
		homePage.clickOnAccountBtn();
		
		CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
		createAnAccountPage.personalInfomation();
		createAnAccountPage.addressInformation();
		
		CheckoutProcess checkoutProcess = new CheckoutProcess();
		checkoutProcess.womenDress();
		
		
	}
}
