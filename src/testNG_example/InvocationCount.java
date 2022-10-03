package testNG_example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=3)
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(priority=2)
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}

}
