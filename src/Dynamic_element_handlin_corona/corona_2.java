package Dynamic_element_handlin_corona;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class corona_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/country/uk");
		String rec = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();
		System.out.println(rec);
		
		String death = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[2]")).getText();
		System.out.println(death);
		
		
	}

}
