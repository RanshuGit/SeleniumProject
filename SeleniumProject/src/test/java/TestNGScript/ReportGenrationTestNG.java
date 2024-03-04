package TestNGScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
 
public class ReportGenrationTestNG {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setup() {
		driver=new ChromeDriver();
		htmlReporter = new ExtentHtmlReporter("extentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		driver.get("https://practice.automationtesting.in/");
	}
	
	@Test
	public void addItemToBasket() throws InterruptedException {
		driver.manage().window().maximize();
		ExtentTest test = extent.createTest("Add Item to Basket","Validate if user can Add Item to Cart using AddToBasket Button");
		test.info("Started");
		test.log(Status.INFO,"Landed on HomePage");
		try {
			WebElement addBasketButton = driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]"));
			addBasketButton.click();
			test.pass("Add To Basket Button Clicked, Item Added to cart");
		} catch (Exception e) {
			test.fail("Add To Basket Button not clicked, Item not added to basket");
		}
		Thread.sleep(2000);
		WebElement viewBasket = driver.findElement(By.cssSelector("#text-22-sub_row_1-0-2-0-0 > div > ul > li > a.added_to_cart.wc-forward"));
		System.out.println(viewBasket.isDisplayed());
		test.log(Status.INFO,"View Basket button is visible");
		test.info("Ended");
	}
	
	@Test
	public void checkItemAddedToCart() {
		driver.manage().window().maximize();
		ExtentTest test = extent.createTest("Check Item Added to Cart", "Verify Item is added to Cart");
		test.info("Started");
		WebElement viewBasket = driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[3]"));
		viewBasket.click();
		test.log(Status.INFO,"Clicked on View Basket Button");
		test.log(Status.INFO,"Landed on Cart Page");
		try {
			WebElement book = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[3]/"));
			book.isDisplayed(); 
			test.pass("Book is Displayed in Cart");
		} catch (Exception e) {
			test.fail("Book is not displayed in Cart");
		}
		test.info("Ended");
	}
	
	@AfterSuite	
	public void close() {
		extent.flush();
		driver.quit();
	}
}