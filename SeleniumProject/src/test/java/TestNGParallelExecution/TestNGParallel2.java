package TestNGParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallel2 {

	WebDriver driver;
	@Test(groups="Regression")
	void openInstagram() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		System.out.println("Thread ID: "+Thread.currentThread().getId());
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(groups="Smoke")
	void testMethod1() {
		System.out.println("Class 2 >> Method1 >> "+Thread.currentThread().getId());
	}
}