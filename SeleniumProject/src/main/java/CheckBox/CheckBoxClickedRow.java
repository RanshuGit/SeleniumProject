package CheckBox;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClickedRow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> element = driver.findElements(By.xpath("//tr"));
		Random random=new Random();
		int index = random.nextInt(1,197);
		
		WebElement checkbox = element.get(index).findElement(By.className("hasVisited"));
		checkbox.click();
		
		String content= element.get(index).getText();
		System.out.println("Selected Row: "+index+":"+content);
		driver.quit();
	}
}