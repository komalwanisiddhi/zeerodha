package freamwork;

import java.time.Duration;
import java.util.ListIterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1_without_DDF {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://kite.zerodha.com/");
		
	
		//maximize
		driver.manage().window().maximize();
		//give global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        //enter the user id
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
		//ENTER PAAWORD
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
		//login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
		//cli login
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	//verify user id
	String expID="DPG458";
	       String actid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	       if(expID.equals(actid)) {
	    	   System.out.println("both are same,test case pass");
	       }
	       else
	       {
	    	   System.out.println("both are not same,test case fail");
	       }
		
	}

}
