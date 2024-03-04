package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllRowsOfTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		 List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
			for (WebElement row : allRows) {
				List<WebElement> cols = row.findElements(By.tagName("td"));
					for (WebElement column : cols) {         
						System.out.print(column.getText()+"    ");
					}
				System.out.println();	
			}
		driver.quit();
	}
}