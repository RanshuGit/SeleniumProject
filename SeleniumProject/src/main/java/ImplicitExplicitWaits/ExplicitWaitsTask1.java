package ImplicitExplicitWaits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplicitWaitsTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Click me, to Open an alert after 5 seconds
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Displayed...");
		
		driver.quit();
	}
}