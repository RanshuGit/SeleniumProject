package ImplicitExplicitWaits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImplicitWaits {
//implicit wait does not depends on condition if he not got element it skip and goes on.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> element = driver.findElements(By.cssSelector("#countries > tbody > t"));         //getting no of rows
		System.out.println("Rows: "+element.size());
		
		List<WebElement> element2 = driver.findElements(By.cssSelector("#countries > tbody > tr:nth-child(1) > td > h3"));         //getting no of columns
		System.out.println("Cloumns: "+element2.size());
		for(WebElement e : element2) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}

}