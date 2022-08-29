package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_divisio {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//inspect cross button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		}

}
