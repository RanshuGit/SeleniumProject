package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[1]"));        //getting heading text
		System.out.println(element.getText());
		
		WebElement element1 = driver.findElement(By.xpath("//input[@value=\"Male\"]"));      //radio button click
		element1.click();
		
		driver.findElement(By.xpath("//button[@id=\"buttoncheck\"]")).click();               //checked result button click 
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]"));       //getting result
		System.out.println(element2.getText());
		if(element2.getText().equals("Radio button 'Male' is checked")) {                                                //validating result
			System.out.println("Male is present..");
		} else {
			System.out.println("Male not present..");
		}
		Thread.sleep(1000);
		driver.quit();
	}
}