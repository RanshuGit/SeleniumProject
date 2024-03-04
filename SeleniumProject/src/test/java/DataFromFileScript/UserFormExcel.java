package DataFromFileScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constants.Constant;
import Utilitys.ExcelUtilityMethods;

public class UserFormExcel {

	static String excelFilePath = Constant.Path_TestData + "testDataExcel.xlsx";

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ExcelUtilityMethods excelUtils = new ExcelUtilityMethods();
		excelUtils.setExcelFile(excelFilePath, "Sheet1");

		for (int i = 0; i < excelUtils.getRowCountInSheet(); i++) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Constants.Constant.URL);
			Elements ele = new Elements(driver);
			ele.fName.sendKeys(excelUtils.getCellData(i, 0));
			ele.lName.sendKeys(excelUtils.getCellData(i, 1));
			ele.eml.sendKeys(excelUtils.getCellData(i, 2));
			ele.mob.sendKeys(excelUtils.getCellData(i, 3));
			ele.add.sendKeys(excelUtils.getCellData(i, 4));
			System.out.println("Row: " + i);
			Thread.sleep(1000);
			driver.quit();
		}
	}
}