package xpath_by_contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		//Enter the UN
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
		
		//verify home page is open or not
		String expT="Amazon.com : mobile";
	    String actT=driver.getTitle();
		if(actT.equals(expT)) {
			System.out.println("home page is opened and TC is pass");
		}
		else {
			System.out.println("home page is not opened and TC is fail");
		}
	
	}
}