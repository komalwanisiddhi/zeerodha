package testing_advatages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_not_equal {
	@Test
	public void TC2() {
		Reporter.log("TC2 pass",true);
		String actR="pinky";
		String expR="donky";
		Assert.assertNotEquals(actR, expR);
	}

}
