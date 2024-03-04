package MagnetoWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	private WebElement homeCreateAccountButton;
	void clickHomeCreateAccountButton() {
		homeCreateAccountButton.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	private WebElement homeSignInButton;
	void clickHomeSignInButton() {
		homeSignInButton.click();
	}	
}