package TESTNG;

import org.testng.annotations.Test;

public class Demo {
	
	
	@Test(groups= {"smoke"})
	public void simple()
	{
		System.out.println("hello");
	}

}
