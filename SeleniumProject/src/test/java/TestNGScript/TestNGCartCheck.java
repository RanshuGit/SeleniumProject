package TestNGScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGCartCheck {
//Open Cart check cart is empty.
	WebDriver driver;
	
	@BeforeClass()
	public void startDriver( ) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	@BeforeMethod()
	void accountLogin() {
		driver.get("https://www.amazon.in");
		System.out.println("Logged in...");
	}
	
	@Test(groups = {"Smoke","Regression"},dataProvider = "userdetails")
	void Login(String username,String password) {
		System.out.println("user: "+username);
		System.out.println("password: "+password);
	}
	
	@Test(description="Checking Cart")
	public void checkCart() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class=\"nav-a nav-a-2 nav-progressive-attribute\"]")).click();
		System.out.println("Inside Cart...");
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	@AfterMethod() 
	public void accountLogout() {
		System.out.println("Logged Out!!");
	}
	
	@AfterClass()
	public void closeDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name="userdetails")
	Object[][] TestData() {
		Object arr[][]= {{"Username1","Password1"},{"Username2","Password2"},
				{"Username3","Password3"},{"Username4","Password4"}};
		return arr;
	}
}
