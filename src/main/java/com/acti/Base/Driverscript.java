package com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class Driverscript {
	
	public static WebDriver driver;
	static Properties prop;
	
	
	
	public Driverscript()
	{
		try
		{
			//System.out.println("step 1");
			prop= new Properties();
			File src = new File("./acti.Configuration/config.properties");
			//System.out.println("step 2");
			FileInputStream fis = new FileInputStream(src);
			//System.out.println("step 3");
			prop.load(fis);
			//.out.println("step 4");
		}
		catch (Exception e) {
			
		System.out.println(" file not found" + e.getMessage());
		}
	}
	
	
	public static void initbrowser()
	{
		//System.out.println("step 5");
		String browser = prop.getProperty("browser");
		//System.out.println("step 11");
		if (browser.equalsIgnoreCase("chrome")) 
		{
			
			System.setProperty("webdriver.chrome.driver", "./acti.Browsers/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./acti.Browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println(" no proper browser find : please check the properities file");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		String url = prop.getProperty("qaurl");
		driver.get(url);
		
	}

}
	
	


