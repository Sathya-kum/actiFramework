package com.acti.Testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.Driverscript;
import com.acti.pages.Loginpage;

// created by sathya
public class Tc01_Login extends Driverscript {
	
	Loginpage lp;
	
	public Tc01_Login()
	{
		super();
	}
	
	@BeforeMethod
	public void pretest()
	{
		
		initbrowser();
		lp = new Loginpage();
		
	}
	
	
	@AfterMethod
	public void posttest()
	{
		System.out.println("close");
		driver.close();
	}
	
	@Test(priority= 1)
	public void testverifyTitle()
	{
		
		
				String tittle = lp.VerifyTitle();
				System.out.println(tittle);
				
	}
	
	@Test(priority= 2)
	public void testVerifyLogoDisplayed()
	{
		 boolean res = lp.VerifyLogoisDisplayed();
				 System.out.println(res);
				 
	}
	
	@Test(priority= 3)
	public void testValidateLoginFunction()
	{
		lp.VladiateLoginFunction("admin", "manager");
		
	}
	
}



	


