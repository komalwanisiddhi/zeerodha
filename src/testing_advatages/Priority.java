package testing_advatages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=4)
	public void TC1() {
		Reporter.log("good morning",true);
	}
	@Test(priority=3)
	public void TC2() {
		Reporter.log("i am happy",true);
	}
   @Test(priority=2)
   public void TC3() {
	   Reporter.log("good",true);
   }
   @Test(priority=1)
   public void TC4() {
	   Reporter.log("heiii",true);
   }
}
