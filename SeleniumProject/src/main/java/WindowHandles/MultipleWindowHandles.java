package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	

public class MultipleWindowHandles {				
  public static void main(String[] args) throws InterruptedException {	            //pending
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.salesforce.com/in/");

    driver.findElement(By.xpath("//*[@id=\"1693966637083_fub\"]/div/div/div[2]/div/pbc-button/a")).click();
	String cid=driver.getWindowHandle();
	Set<String> allid=driver.getWindowHandles();
	for(String ids:allid) {
		if(!(ids.equals(cid))){
			driver.switchTo().window(ids);
			System.out.println(driver.switchTo().window(ids).getTitle());
		}
	}
	driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/th-alert/a")).click();
	
	driver.quit();
    }
}
