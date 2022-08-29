package xpath_by_contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
         driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("EWD273");
	     Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Pranav@2109");
		Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		
	    		  String expt="Kite - Zerodha's fast and elegant flagship trading platform";
	    			String act=driver.getTitle();
	    			if(act.equals(expt)) {
	    			System.out.println("test case pass");
	    			}
	    		   else {
	    			System.out.println("test case fail");
	    			
	    		   }
	    		}

	    	}


