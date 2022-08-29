package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomePage {//BLC
	@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement userID;
	
	//intilzation
	public kitehomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	//utization
	public void verifyuserID() {
		String expID="DPG";
		String actID=userID.getText();
		if(actID.equals(expID)) {
			System.out.println("tc pass");
		}
		else {
			System.out.println("tet case fail");
		}
	}
	

}
