package TESTNG;

import org.testng.annotations.Test;

public class Demo2 {

	
	@Test(groups= {"smoke"})
	public void secondclass()
	{
		System.out.println("secondclass");
	}
	@Test(enabled=false)
	public void fourthclaslogins()
	{
		System.out.println("fourthclass");
	}
}
