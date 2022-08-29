package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement LOGINBTN;
	
	//Step 2 Intilzation
	public KiteLogin1Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//step 3 Utilization
	public void enterUN()
	{
		UN.sendKeys("DPG458");
	}
	public void enterPWD() {
		PWD.sendKeys("Amol@1234");
	}
	public void clickLOGINBTN() {
		PWD.click();
	}
	
}
