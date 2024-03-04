package TestNGParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallel1 {

	
	WebDriver driver;
	@Test
	void openFacebook() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Thread ID: "+Thread.currentThread().getId());
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(groups="Smoke")
	void testMethod1() {
		System.out.println("Class 1 >> Method1 >> "+Thread.currentThread().getId());
	}
	
	@Test(groups="Regression")
	void testMethod2() {
		System.out.println("Class 1 >> Method2 >> "+Thread.currentThread().getId());
	}
}