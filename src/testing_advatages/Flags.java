package testing_advatages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags {
	@Test(invocationCount=7)
	public void TC() {
		Reporter.log("running tc",true);
	}

}
