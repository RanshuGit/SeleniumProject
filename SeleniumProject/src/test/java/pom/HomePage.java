package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
class HomePage {
	@FindBy(xpath="//*[@id=\"header\"]/a")
	private WebElement pullDownNavbar;
	HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	void pullDownNavbarButton() {
		pullDownNavbar.click();
	}
	
	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")
	private WebElement book1Details;
	void clickBook1Details() {
		book1Details.click();
	}
	
	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")
	private WebElement book2Details;
	void clickBook2Details() {
		book2Details.click();
	}
	
	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")
	private WebElement book3Details;
	void clickBook3Details() {
		book3Details.click();
	}
	
	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")         
	private WebElement addBasketButton1;
		void clickAddBasketBtn1() {
		addBasketButton1.click();
	}
	
	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[2]")
	private WebElement addBasketButton2;
	void clickAddBasketBtn2() {
		addBasketButton2.click();
	}
	
	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]")
	private WebElement addBasketButton3;
	void clickAddBasketBtn3() {
		addBasketButton3.click();
	}
	
	@FindBy(xpath="//*[@id=\"mc4wp-form-1\"]/div[1]/p[1]/input")
	private WebElement subscribeEmail;
	void enterSubscribeEmail(String email) {
		subscribeEmail.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement subscribeButton;
	void clickSubscribeButton() {
		subscribeButton.click();
	}
} 