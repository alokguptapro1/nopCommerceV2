package com.nopCommerce.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseUrl);

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();

		Thread.sleep(5000);
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Assert.assertTrue(true);
		}
		else
		{
		//	Assert.assertFalse(true);
			Assert.fail();
		}
//		try
//		{
//		Assert.assertTrue(driver.getTitle().equals("Dashboard "));
//		}
//		catch(AssertionError e)
//		{
//			System.out.println("error");
//		}
		lp.clickLogout();

	}

	

}
