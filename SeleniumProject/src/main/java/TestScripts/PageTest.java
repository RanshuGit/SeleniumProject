package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://trailhead.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/th-alert/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}