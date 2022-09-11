package TESTNG;

import org.testng.annotations.Test;

public class Login {

	
	
	@Test(groups= {"smoke"})
	public void homeloan()
	{
		
		System.out.println("homeloan");
	}
	@Test
	public void carloan()
	{
		
		System.out.println("carloan");
	}
	@Test
	public void personalloan()
	{
		
		System.out.println("personalloan");
	}
}
