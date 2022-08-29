package testing_advatages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Equal {
	@Test
	public void TC1() {
		Reporter.log("TC1 pass",true);
		String actR="PINKY";
		String expR="PINKY";
		Assert.assertEquals(expR,actR);
	}

}
