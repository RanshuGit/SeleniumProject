package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTask3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
;		//handling third alert
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		String str3 = driver.switchTo().alert().getText();
		System.out.println(str3);
		driver.switchTo().alert().sendKeys("Anshu");
		driver.switchTo().alert().accept();
		String str4 = driver.findElement(By.cssSelector("#demo1")).getText();
		System.out.println(str4);
		Thread.sleep(1000);
		driver.quit();
		
	}

}
