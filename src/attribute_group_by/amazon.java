package attribute_group_by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("vivo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input)[5]")).click();
		Thread.sleep(3000);
		driver.close();
        Thread.sleep(3000);
		
		String expt="Amazon.com : vivo.";
		String act=driver.getTitle();
		if(act.equals(expt)) {
		System.out.println("test case pass");
		}
	   else {
		System.out.println("test case fail");
	}
   }
}
