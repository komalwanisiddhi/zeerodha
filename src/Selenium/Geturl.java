package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Geturl {
	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
String link=driver.getCurrentUrl();
System.out.println(link);

String title=driver.getTitle();
System.out.println(title);
	}

}
