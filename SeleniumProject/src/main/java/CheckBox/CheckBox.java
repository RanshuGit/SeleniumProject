package CheckBox;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();    			//select CheckBox from main page
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));   					//click on checkBox
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));      	//selecting for text to return
		System.out.println(element.getText());                                                 	//returning text
		if(element.getText().equals("Checkboxes")) {                                          	//validating on same page
			System.out.println("User is on Checkbox page");
		} else {
			System.out.println("User is not on Checkbox page");
		}
		Thread.sleep(2000);
		driver.navigate().back();                                                              	//navigating back
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
		if(element1.getText().equals("Checkboxes")) {                                          	//validating for not on the page
			System.out.println("User is on Checkbox page");
		} else {
			System.out.println("User is not on Checkbox page");
		}
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();    			//select CheckBox from main page
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		element2.click();
		if(element2.isSelected()) {
			System.out.println("Checked..");
		} else {
			System.out.println("Not Checked..");
		}
		driver.quit();
	}
}
