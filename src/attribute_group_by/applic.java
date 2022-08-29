package attribute_group_by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class applic {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.applitools.com/");
		Thread.sleep(3000);
		//Enter the UN
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Komal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("18061998");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a)[2]")).click();
		Thread.sleep(3000);
		
		//verify home page is open or not
		String expT="ACME demo app";
	    String actT=driver.getTitle();
		if(actT.equals(expT)) {
			System.out.println("home page is opened and TC is pass");
		}
		else {
			System.out.println("home page is not opened and TC is fail");
		}
	}
}