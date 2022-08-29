package Attime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log_to_application_attime {
	public static void main(String[] args) throws Throwable {
		//set property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		}

}
