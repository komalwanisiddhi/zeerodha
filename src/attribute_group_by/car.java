package attribute_group_by;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

public class car { 
			public static void main(String[] args) throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//open the application
				driver.get("https://www.youtube.com/");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input)[1]")).sendKeys("motu pattalu");
			     Thread.sleep(3000);
				driver.findElement(By.xpath("(//button)[8]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//img)[121]")).click();
				
				String expT="motu pattalu - YouTube";
			    String actT=driver.getTitle();
				if(actT.equals(expT)) {
					System.out.println("home page is opened and TC is pass");
				}
				else {
					System.out.println("home page is not opened and TC is fail");
				}
			
			}

		}

		
