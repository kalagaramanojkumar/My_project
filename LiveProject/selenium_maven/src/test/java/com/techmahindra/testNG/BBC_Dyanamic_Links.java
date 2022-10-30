package com.techmahindra.testNG;

import org.testng.annotations.Test;
import com.techmahindra.selenium.java.BasePage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BBC_Dyanamic_Links extends BasePage {

	/* public WebDriver driver; */
	@Test
	public void f() throws Exception {

		WebElement table = driver.findElement(By.xpath("//div[@class='most-popular']"));

		List<WebElement> listOfLinks = table.findElements(By.tagName("a"));
		System.out.println("The available Links are: " + listOfLinks.size());
		
		  for (int i = 0; i < listOfLinks.size(); i++) {
		  System.out.println(listOfLinks.get(i).getText()); listOfLinks.get(i).click();
		  Thread.sleep(3000); System.out.println(driver.getCurrentUrl());
		  driver.navigate().back(); table =
		  driver.findElement(By.xpath("//div[@class='most-popular']")); listOfLinks =
		  table.findElements(By.tagName("a")); }
	}

	@BeforeTest
	public void beforeTest() {
		browserLaunch("Chrome", "http://www.bbc.com");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\chromedriver.exe"); driver
		 * = new ChromeDriver(); driver.get("http://www.bbc.com");
		 * driver.manage().window().maximize();
		 */
	}

}
