package com.techmahindra.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
	public WebDriver driver;
	public static Actions a;
	public void browserLaunch(String browser, String url) {
		 
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
driver.get(url);
driver.manage().window().maximize();
	}

}
