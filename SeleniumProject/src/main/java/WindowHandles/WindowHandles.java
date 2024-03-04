package WindowHandles;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class WindowHandles {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("//img[@alt=\"Facebook Marketing Partner\"]")).click();
		String cid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		
		for(String ids:allid) {
			if(!(ids.equals(cid))){
				driver.switchTo().window(ids);
				System.out.println(driver.switchTo().window(ids).getTitle());
			}
		}
		driver.findElement(By.xpath("//a[@class=\"_3cr5 _8p_9 _53m5 _8xo6 _8xo4 _1s6c _93rg _3cky\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _42fu layerCancel uiOverlayButton selected _42g- _42gy\"]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
 
}