package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BuyBook {
	@Test
	void BuyBook() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		
		HomePage hp = new HomePage(driver);
		hp.clickAddBasketBtn1();
		hp.clickAddBasketBtn2();
		hp.enterSubscribeEmail("amit@gmail.com");
		hp.clickSubscribeButton();
		Thread.sleep(3000);
		driver.quit();
	}
}