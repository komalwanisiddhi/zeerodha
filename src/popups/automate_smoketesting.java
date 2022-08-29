package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate_smoketesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        //login page
		
	    driver.get("https://demo.actitime.com/login.do");	
	
	}

}
