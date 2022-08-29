package xpath_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpkart {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open the application
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("sumsung mobile");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(4000);
	driver.close();
	
	String expt="Sumsung Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
	String act=driver.getTitle();
	if(act.equals(expt)) {
	System.out.println("test case pass");
	}
   else {
	System.out.println("test case fail");
	
   }
	}
}
