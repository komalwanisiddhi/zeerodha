package testing_advatages;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
@BeforeClass
	public void openbrowser() {
	Reporter.log("open the browser",true);
}
@BeforeMethod
public void loginapp() {
	Reporter.log("login the page",true);
}
@Test
public void verifyID() {
	Reporter.log("verify userid",true);
}
@AfterMethod
public void logout() {
   Reporter.log("logout",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("close browser",true);
 }
}
