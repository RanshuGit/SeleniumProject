package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Entering Frame 1
		driver.switchTo().frame(0);
		String str = driver.findElement(By.xpath("/html/body/center/b")).getText();
		System.out.println(str);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Hello");
		
		//Entering Frame 4
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		String str1 = driver.findElement(By.xpath("//*[@id=\"id4\"]/div")).getText();
		System.out.println(str1);
		
		//Entering Frame 3
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Frame3");
		
		//Entering Frame 3 SubFrame
		WebElement element = driver.findElement(By.xpath("/html/body/center/iframe"));
		driver.switchTo().frame(element);
		String str2 = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[1]/div/div[2]/div[1]/div")).getText();
		System.out.println(str2);
		driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]")).click();
		
		//back to Frame 3
		driver.switchTo().parentFrame();
		String str3 = driver.findElement(By.xpath("//*[@id=\"id3\"]/div")).getText();
		System.out.println(str3);
		
		//Back to Frame 1
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		String str4 = driver.findElement(By.xpath("/html/body/center/b")).getText();
		System.out.println(str4);
		Thread.sleep(1000);
		driver.quit();

	}

}
