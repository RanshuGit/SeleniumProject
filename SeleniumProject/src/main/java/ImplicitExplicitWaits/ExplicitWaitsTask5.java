package ImplicitExplicitWaits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplicitWaitsTask5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Check CheckBox after 10 seconds                                                                  //pending
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.id("checkbox")).click();
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
		//boolean status = element.isSelected();
		//if(status) {
			System.out.println("Displayed...");
		//} else {
			System.out.println("Not Displayed...");
		
	
		//Thread.sleep(3000);
		//driver.quit();
	}
}