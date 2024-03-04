package TestScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 
public class TestLambdaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.lambdatest.com");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
		driver.findElement(By.id("email")).sendKeys("rajput@gmail.com");
		driver.findElement(By.name("password")).sendKeys("rajput@123");
		driver.findElement(By.cssSelector("[id=\"login-button\"]")).click();
		System.out.println("Wrong Username and Password!!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"/register\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		WebElement element = driver.findElement(By.linkText("Platform"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		System.out.println("Done");
		driver.quit();
	}
} 