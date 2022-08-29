package testing_advatages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {
	@Test
	public void TC5() {
		Reporter.log("running TC5",true);
		Assert.fail();//Verification 1
		System.out.println("I am after fail");//verification2
	}
	@Test
	public void TC6() {
	Reporter.log("i am TC6");
}

}
