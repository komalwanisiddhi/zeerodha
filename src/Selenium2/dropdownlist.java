package Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownlist {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      //open the drowser
      driver.get("file:///C:/Users/shree/Documents/CHATPATA.HTML");
}
}
