package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		System.out.println(element.getText());
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		dropdown.click();
		Thread.sleep(3000);
		
		List <WebElement> element1 = driver.findElements(By.xpath("//*[@id=\"dropdown\"]"));
		for(WebElement ele : element1) {
			System.out.println(ele.getText());
		}

		dropdown.sendKeys("Option 2");
		Thread.sleep(1000);
		dropdown.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
