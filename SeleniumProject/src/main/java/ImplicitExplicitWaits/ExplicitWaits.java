package ImplicitExplicitWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	public static void main(String[] args) throws InterruptedException {
//explicit wait waits for specific condition to occur then it execute further
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		WebElement element = driver.findElement(By.xpath("//button[@onclick=\"timedText()\"]"));
		element.click();
		
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		boolean status = element2.isDisplayed();
		if(status) {
			System.out.println("Displayed...");
		} else {
			System.out.println("Not Displayed...");
		}
		
		driver.quit();
	}
}