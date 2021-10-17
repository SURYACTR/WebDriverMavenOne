package com.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest{
	
	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserExeFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://way2automation.com");
		driver.quit();
	}
	
}

