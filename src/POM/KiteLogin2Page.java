package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath ="//button[text()='Continue ']")private WebElement cntbtn;
	
	//intilization
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void enterPIN() {
		PIN.sendKeys("171992");
	}
	public void cntbtn() {
		cntbtn.click();
	}

}
