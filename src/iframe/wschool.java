package iframe;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wschool {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(3000); 
		
		//switch to frame no2
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("komal");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("wani");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
