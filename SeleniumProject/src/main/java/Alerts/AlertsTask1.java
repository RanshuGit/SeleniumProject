package Alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTask1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		driver.get("https://demo.automationtesting.in/Register.html");
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
//		element.click();
//		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul"));
//		for(WebElement option : options) {
//			System.out.println(option.getText());
//			if(option.getText().equals("Alerts")) {
//				option.click();
//				break;
//			}
//		}
		
		//handling first alert
  		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		//handling second alert
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		String str1 = driver.switchTo().alert().getText();
		System.out.println(str1);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		String str2 = driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println(str2);
		
		//handling third alert
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		String str3 = driver.switchTo().alert().getText();
		System.out.println(str3);
		driver.switchTo().alert().sendKeys("Doing Testing");
		driver.switchTo().alert().accept();
		String str4 = driver.findElement(By.cssSelector("#demo1")).getText();
		System.out.println(str4);
		Thread.sleep(1000);
		driver.quit();
	}

}
