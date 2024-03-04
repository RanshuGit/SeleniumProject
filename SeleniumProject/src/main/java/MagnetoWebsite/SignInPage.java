package MagnetoWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class SignInPage {
	
	SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[2]/div[2]/div/div/a")
	private WebElement createAccountButton;
	void clickCreateAccountButton() {
		createAccountButton.click();
	}
	
	@FindBy(name="login[username]")
	private WebElement email;
	void enterEmail(String emailId) {
		email.sendKeys(emailId);
	}
	
	@FindBy(name="login[password]")
	private WebElement password;
	void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//button[@class=\"action login primary\"]")
	private WebElement signInButton;
	void clickSignInButton() {
		signInButton.click();
	}
}