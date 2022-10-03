package testNG_example;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failed_test {
	@Test(priority=3)
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test(priority=1)
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(priority=2)
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}
	
	
	@Test(priority=3)

	public void m4()
	{
		Assert.fail();
		Reporter.log("Running test case 4",true);
	}
	
	@Test(priority=4)
	public void m5() throws InterruptedException
	{
		
		Reporter.log("Running test case 4",true);
	}

}
