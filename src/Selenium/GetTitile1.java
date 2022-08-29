package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitile1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String expT="Google";
	String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("PASS");
	}
	else {
		System.out.println("fail");
	}
	
	
	}
}

