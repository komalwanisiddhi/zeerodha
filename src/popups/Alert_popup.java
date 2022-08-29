package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		//click o submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch to main main webpage to popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		//click on ok button
		alt.accept();
		Thread.sleep(3000);
		//cancel button
		alt.dismiss();
		
		//get the next popup
		Thread.sleep(3000);
		String text=alt.getText();
		System.out.println(text);
	}

}
