package MagnetoWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"firstname\"]")
	private WebElement firstName;
	void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	@FindBy(xpath="//input[@id=\"lastname\"]")
	private WebElement lastName;
	void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	@FindBy(xpath="//input[@id=\"email_address\"]")
	private WebElement accountEmail;
	void enterAccountEmail(String aEmail) {
		accountEmail.sendKeys(aEmail);
	}
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement accountPassword;
	void enterAccountPassword(String aPass) {
		accountPassword.sendKeys(aPass);
	}
	
	@FindBy(xpath="//input[@id=\"password-confirmation\"]")
	private WebElement accountPasswordConfirm;
	void enterAccountPasswordConfirm(String aPassCon) {
		accountPasswordConfirm.sendKeys(aPassCon);
	}
	
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
	private WebElement createAccount;
	void clickCreateAccount() {
		createAccount.click();
	}
}
