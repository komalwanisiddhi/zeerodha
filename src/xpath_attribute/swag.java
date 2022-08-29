package xpath_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swag {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("problem_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sause");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]")).click();
		Thread.sleep(3000);
		//driver.close();
		
		String expt="Swag Labs";
		String act=driver.getTitle();
		if(act.equals(expt)) {
		System.out.println("test case pass");
		}
	   else {
		System.out.println("test case fail");
		
	   }
		
		
	}

}

