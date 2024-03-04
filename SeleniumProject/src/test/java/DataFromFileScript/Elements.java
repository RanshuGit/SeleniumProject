package DataFromFileScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {
	private WebDriver driver;
	public WebElement fName, lName, eml, gen, mob, dob, sub, hob, add, submt;
	
	public Elements(WebDriver driver) {
	this.driver=driver;
	fName = driver.findElement(By.cssSelector("#firstName"));
	lName = driver.findElement(By.cssSelector("#lastName"));
	eml = driver.findElement(By.cssSelector("#userEmail"));
	gen = driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)"));
	mob = driver.findElement(By.cssSelector("#userNumber"));
	//dob = driver.findElement(By.cssSelector("#dateOfBirthInput"));
	//sub = driver.findElement(By.cssSelector("#subjectsContainer > div > div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3"));
	hob = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]"));
	add = driver.findElement(By.cssSelector("#currentAddress"));
	submt = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	}
}