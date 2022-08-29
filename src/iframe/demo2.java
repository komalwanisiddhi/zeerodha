package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) throws Throwable { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		Thread.sleep(3000);
		
		//switch to 1st frame
		 driver.switchTo().frame("packageListFrame");
		    String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		  System.out.println(text);
		   
		  //switch to 2nd frame
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame("packageFrame");
		  String text1 = driver.findElement(By.xpath("//a[text()='AbstractDriverOptions']")).getText();
		  System.out.println(text1);
		  
		  //switch to 3rd frame
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame("classFrame");
		  String text2 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		  System.out.println(text2);
	}
	

}
