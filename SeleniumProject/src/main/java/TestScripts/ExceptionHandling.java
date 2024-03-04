package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {
	 
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        int max = 5;
        int trial = 0;
        while (trial < max) {
            try {
                driver.get("https://www.ajio.com/");
                WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search JIO\"]"));   //AJIO A missing
                searchBox.sendKeys("trouser");
                Thread.sleep(1000);
                System.out.println("Search is successful");
                break; 
            } catch (Exception e) {
                System.out.println("Attempt "+(trial+1)+" failed!");
                trial++;
            }
        }
        if (trial == max) {
            System.out.println("Search failed! Total Trial: "+max);
        }
        driver.quit();
	}
}