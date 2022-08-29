package freamwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script2_with_DDF {
	public static void main(String[] args) throws Throwable {
		//create file of class
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\Desktop\\KOMAL\\zerodha.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("ddf");
	//set properties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open application
	
	driver.get("https://kite.zerodha.com/");
	//globalwait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//maximize
	driver.manage().window().maximize();
	//enter the user id
	  String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	//password
	String pas = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pas);
	//login
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	 String pin = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	//continue
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
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
