package testNG_example;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_case {

	@Test(priority=3)
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test()
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test()
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}
	
	
	@Test()

	public void m4()
	{
		
		Reporter.log("Running test case 4",true);
	}
	
	@Test()
	public void m5() throws InterruptedException
	{
		
		Reporter.log("Running test case 4",true);
	}
	
	@Test()
	public void m6() throws InterruptedException
	{
		
		Reporter.log("Running test case 4",true);
	}
}
