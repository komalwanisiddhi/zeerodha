package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	Dimension d=new Dimension(100, 200);
	driver.manage().window().setSize(d);
	
	Point p=new Point(300,400);
	driver.manage().window().setPosition(p);
	}

}
//https://demo.actitime.com/login.do