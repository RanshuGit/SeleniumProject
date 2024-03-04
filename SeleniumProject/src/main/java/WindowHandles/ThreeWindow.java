package WindowHandles;
 
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ThreeWindow {

public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.salesforce.com/in/");
driver.findElement(By.cssSelector("#\\31 693966637083_fub > div > div > div.thmfe_cta > div > pbc-button > a")).click();
 
String s1=driver.getWindowHandle();
Set<String> s2=driver.getWindowHandles();

for(String s: s2) {
	if(!(s.equals(s1))) {
		driver.switchTo().window(s);
	}
}

driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/th-alert/a")).click();

Set<String> s3=driver.getWindowHandles();
for(String s: s3) {
	driver.switchTo().window(s);
	String name=driver.getTitle();
	System.out.println(name);
}
Thread.sleep(3000);
driver.switchTo().window(s1);
Thread.sleep(1000);
driver.quit();
}
}