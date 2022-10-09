package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;
import utilities.CommonMethods;

public class HomePage extends CommonMethods{

	public HomePage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	
	}
	
	//@FindBy = driver.findElement(By.)
	
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'Sign in')]"),
		@FindBy(xpath = "//a[@title='Log in to your customer account']")
	})
	WebElement signIn;
	
	@FindAll({
		@FindBy(id = "email_create"),
		@FindBy(xpath = "//input[@id='email_create']")
	})
	WebElement emailAddress;
	
	@FindAll({
		@FindBy(id = "SubmitCreate"),
		@FindBy(xpath = "//button[@id='SubmitCreate']")
	})
	WebElement accountBtn;
	
	public void clickOnSignIn() {
		signIn.click();
		
	}
	
	public void sendEmail() {
		sendText(emailAddress, emailGenerate());
		timeOut();
	}
	
	public void clickOnAccountBtn() {
		accountBtn.click();
		timeOut(5000);
	}
	
	
}
