package DataFromFileScript;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Constants.Constant;
import Utilitys.JSonUtilityMethods;

//class Student {
//	String fname;
//	String lname;
//	String email;
//	String mobile;
//}
public class UserFormJson {

	public static void main(String[] args) throws InterruptedException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser jsonPar = new JSONParser();
		FileReader reader = new FileReader(Constant.Path_TestData + "userData.json");
		Object obj = jsonPar.parse(reader);
		JSONArray usersList = (JSONArray) obj;
		for (int i = 0; i < usersList.size(); i++) {
			WebDriver driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			driver.get(Constants.Constant.URL);
			JSONObject users = (JSONObject) usersList.get(i);
			String firstName = (String) users.get("firstName");
			String lastName = (String) users.get("lastName");
			String email = (String) users.get("email");
			String mobileNo = (String) users.get("mobileNo");
			String address = (String) users.get("address");

			Elements ele = new Elements(driver);
			JSonUtilityMethods meth = new JSonUtilityMethods();
			meth.sendKeyData(ele.fName, firstName);
			// ele.fName.sendKeys(firstName);
			ele.lName.sendKeys(lastName);
			ele.eml.sendKeys(email);
			meth.clickOperation(ele.gen);
			// ele.gen.click();
			ele.mob.sendKeys(mobileNo);
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,500)", "");
			ele.hob.click();
			ele.add.sendKeys(address);
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,500)", "");
			ele.submt.click();
			Thread.sleep(1000);
			driver.quit();
			System.out.println("User Data: " + i + " : " + users);
		}

//		Student std = new Student();
//		std.fname = "Ramu";
//		std.lname = "Shirkhe";
//		std.email = "ramu@gmail.com";
//		std.mobile = "7111153418";
//		
//		Student std2 = new Student();
//		std2.fname = "Rita";
//		std2.lname = "Shirkhe";
//		std2.email = "rita@gmail.com";
//		std2.mobile = "7222153418";
//		
//		Student std3 = new Student();
//		std3.fname = "Rohit";
//		std3.lname = "Shirkhe";
//		std3.email = "rohit@gmail.com";
//		std3.mobile = "7888153418";
//		
//		WebElement fName = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
//		fName.sendKeys(std.fname);
//		WebElement lName = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
//		lName.sendKeys(std.lname);
//		WebElement Email = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
//		Email.sendKeys(std.email);
//		WebElement MobileNo = driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]"));
//		MobileNo.sendKeys(std.mobile);
//		
//		fName.clear();
//		lName.clear();
//		Email.clear();
//		MobileNo.clear();
//		
//		Thread.sleep(2000);
//		WebElement fName2 = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
//		fName2.sendKeys(std2.fname);
//		WebElement lName2 = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
//		lName2.sendKeys(std2.lname);
//		WebElement Email2 = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
//		Email2.sendKeys(std2.email);
//		WebElement MobileNo2 = driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]"));
//		MobileNo2.sendKeys(std2.mobile);
//		
//		fName2.clear();
//		lName2.clear();
//		Email2.clear();
//		MobileNo2.clear();
//		
//		Thread.sleep(2000);
//		WebElement fName3 = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
//		fName3.sendKeys(std3.fname);
//		WebElement lName3 = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
//		lName3.sendKeys(std3.lname);
//		WebElement Email3 = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
//		Email3.sendKeys(std3.email);
//		WebElement MobileNo3 = driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]"));
//		MobileNo3.sendKeys(std3.mobile);
//		Thread.sleep(3000);

	}
}