package testing_advatages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TRUE {
	@Test
public void TC3() {
	Reporter.log("running TC3",true);
	boolean actR=true;
	Assert.assertTrue(actR);
}
}
