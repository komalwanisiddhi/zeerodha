package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//create a object of browser setting class
	ChromeOptions c=new ChromeOptions();
	//call addArgument method of browser setting class
	c.addArguments("--disale notification");
	//pass ref variable in chromedriver constructor
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://www.hdfc.com/");
  }
}

