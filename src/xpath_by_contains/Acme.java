package xpath_by_contains;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acme {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.acme.com/");
	    Thread.sleep(3000); 
	    
	    
	    
	    String expt="ACME Laboratories";
		String act=driver.getTitle();
		if(act.equals(expt)) {
		System.out.println("test case pass");
		}
	   else {
		System.out.println("test case fail");
	    }
	   }
	}
