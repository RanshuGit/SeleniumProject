package Utilitys;

import org.openqa.selenium.WebElement;
 
public class JSonUtilityMethods {
	
	public void clickOperation(WebElement element) {
		element.click();
	}
 
	public void sendKeyData(WebElement element, String data) {
		element.sendKeys(data);
	}
}
 