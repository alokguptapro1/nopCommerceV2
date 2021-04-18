package com.nopCommerce.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public String baseUrl = "http://admin-demo.nopcommerce.com/";
	public String username = "admin@yourstore.com";
	public String password = "admin";
	public static WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void setUp(String br)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C://Users/Alok/eclipse-workspace/nopCommerceV2/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}

//		else if(br.equals("firefox"))
//		{
//		System.setProperty("webdriver.chrome.driver", "C://Users/Alok/eclipse-workspace/nopCommerceV2/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		}
//		
//		else if(br.equals("ie"))
//		{
//		System.setProperty("webdriver.chrome.driver", "C://Users/Alok/eclipse-workspace/nopCommerceV2/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		}
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	
	
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

}
