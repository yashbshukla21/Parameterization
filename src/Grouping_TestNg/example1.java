package Grouping_TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1 {
	@Test(groups="Regression")
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test(groups="sanity")
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(groups="Regression")
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}
	
	
	@Test(groups="sanity")

	public void m4()
	{
		
		Reporter.log("Running test case 4",true);
	}
	
	@Test(groups="Regression")
	public void m5() throws InterruptedException
	{
		
		Reporter.log("Running test case 5",true);
	}
	
	@Test(groups="sanity")
	public void m6() throws InterruptedException
	{
		
		Reporter.log("Running test case 6",true);
	}

}
