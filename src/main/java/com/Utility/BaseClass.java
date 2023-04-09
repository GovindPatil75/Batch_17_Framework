package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
	
	@BeforeSuite
	public void ConfigurationSetup() throws Exception {
		 excel=new ExcelDataProvider();
		 config=new ConfigDataProvider();
	}
	
	@BeforeMethod
	public void setup() {
		
		System.out.println("Browser open");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.getBaseUrl_QA1());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown() {
		
		System.out.println("Window close ");
		//driver.quit();
	}

}
