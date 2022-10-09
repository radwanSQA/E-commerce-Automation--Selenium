package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import drivers.PageDriver;
import utilities.CommonMethods;

public class CreateAnAccountPage extends CommonMethods{
     
	public CreateAnAccountPage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindAll({
		@FindBy(id = "id_gender1"),
		@FindBy(xpath = "label[for='id_gender1']")
	})
	WebElement mrTitle;
	
	@FindAll({
		@FindBy(id = "id_gender2"),
		@FindBy(xpath = "label[for='id_gender2']")
	})
	WebElement mrsTitle;
	
	
	@FindAll({
		@FindBy(id = "customer_firstname"),
	})
	WebElement cFirstname;
	
	@FindAll({
		@FindBy(id = "customer_lastname"),
	})
	WebElement cLastname;
	
	@FindAll({
		@FindBy(id = "email"),
	})
	WebElement email;
	
	@FindAll({
		@FindBy(id = "passwd"),
	})
	WebElement passwd;
	
	@FindAll({
		@FindBy(id = "days"),
	})
	WebElement days;
	
	@FindAll({
		@FindBy(id = "months"),
	})
	WebElement months;
	
	@FindAll({
		@FindBy(id = "years"),
	})
	WebElement years;
	
	@FindAll({
		@FindBy(id = "uniform-newsletter"),
	})
	WebElement newsletter;
	
	@FindAll({
		@FindBy(id = "uniform-optin"),
	})
	WebElement offerNews;
	
    // YOUR ADDRESS INFORMATION
	
	
	@FindAll({
		@FindBy(id = "firstname"),
	})
	WebElement firstname;
	
	@FindAll({
		@FindBy(id = "lastname"),
	})
	WebElement lastname;
	
	
	@FindAll({
		@FindBy(id = "company"),
	})
	WebElement company;
	
	@FindAll({
		@FindBy(id = "address1"),
	})
	WebElement address1;
	
	
	@FindAll({
		@FindBy(id = "address2"),
	})
	WebElement address2;
	
	@FindAll({
		@FindBy(id = "city"),
	})
	WebElement city;
	
	@FindAll({
		@FindBy(id = "id_state"),
	})
	WebElement id_state;
	
	
	@FindAll({
		@FindBy(id = "postcode"),
	})
	WebElement postcode;
	
	
	
	@FindAll({
		@FindBy(id = "id_country"),
	})
	WebElement id_country;
	
	@FindAll({
		@FindBy(id = "other"),
	})
	WebElement other;
	
	@FindAll({
		@FindBy(id = "phone"),
	})
	WebElement phone;
	
	
	@FindAll({
		@FindBy(id = "phone_mobile"),
	})
	WebElement phone_mobile;
	
	@FindAll({
		@FindBy(id = "alias"),
	})
	WebElement alias;
	
	@FindAll({
		@FindBy(id = "submitAccount"),
	})
	WebElement submitAccount;
	


	
	public void personalInfomation() {
		mrTitle.click();
		//mrsTitle.click();
		sendText(cFirstname, "Radwan");
		sendText(cLastname, "Ahmed");
		sendText(email, emailGenerate());
		sendText(passwd, "radw123");
		selectItemByIndex(days, 2);
		selectItemByIndex(months, 3);
		selectItemByIndex(years, 2);
		newsletter.click();
		offerNews.click();
		timeOut(3000);
	}
	
	public void addressInformation() {
		sendText(firstname, firstNameGenerate());
		sendText(lastname, lastNameGenerate());
		sendText(company, companyNameGenerate());
		sendText(address1, cityAddressGenerate());
		sendText(address2, streetAddressGenerate());
		sendText(city, stateAddressGenerate());
		selectItemByIndex(id_state, 3);
		sendText(postcode, "00000");
		selectItemByIndex(id_country,1);
		sendText(other, "Additional information");
		sendText(phone, phoneNumberGenerate());
		sendText(phone_mobile, phoneNumberGenerate());
		sendText(alias, cityAddressGenerate());
		submitAccount.click();
		timeOut(3000);
	}
	

	
}
