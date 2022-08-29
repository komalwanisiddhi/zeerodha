package xpath_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatupapp {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.whatsapp.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h5[@class='_9vd5']")).click();
		Thread.sleep(4000);
		driver.close();
		
		
		String expt="WhatsApp";
		String act=driver.getTitle();
		if(act.equals(expt)) {
		System.out.println("test case pass");
		}
	   else {
		System.out.println("test case fail");
		
	   }
		}
	}
