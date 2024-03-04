package MagnetoWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Application {
	WebDriver driver = new ChromeDriver();

	@BeforeSuite
	void setup() {
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@Test()
	void HomePage() {
		HomePage hp = new HomePage(driver);
		// hp.clickHomeCreateAccountButton();
		hp.clickHomeSignInButton();
	}

//	@Test(dependsOnMethods={"HomePage"})
//	void CreateAccount() throws InterruptedException {	
//		CreateAccountPage createAcc = new CreateAccountPage(driver);
//		createAcc.enterFirstName("Abhay");
//		createAcc.enterLastName("Shirkhe");
//		createAcc.enterAccountEmail("abhayshirkhe@gmail.com");
//		createAcc.enterAccountPassword("Abhay@123");
//		createAcc.enterAccountPasswordConfirm("Abhay@123");
//		createAcc.clickCreateAccount();
//	}

	@Test(dependsOnMethods = { "HomePage" })
	void SignIn() throws InterruptedException {

		SignInPage signin = new SignInPage(driver);
		signin.enterEmail("abhay@gmail.com");
		signin.enterPassword("Abhay@123");
		signin.clickSignInButton();
	}

	@AfterSuite
	void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}