package com.techmahindra.testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PrintLinks {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of Links present are:" + links.size());

		/*written by manmath to speed up the execusion
		 * long starttime = System.currentTimeMillis();
		 * links.stream().parallel().filter(x -> !x.getText().isEmpty()).forEach(x ->
		 * System.out.println(x.getText())); long endtime = System.currentTimeMillis();
		 * System.out.println("time taken : " + (endtime - starttime));
		 */

		int count = 0;
		for (int i = 0; i < links.size(); i++) {
			if (!links.get(i).getText().isEmpty()) {
				System.out.println(links.get(i).getText());
				Thread.sleep(1000);
				count++;
				WebElement stale = driver.findElement(By.tagName("a"));
			}

		}
		System.out.println("Visible Links are:" + count);

	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("beforeTest");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.theverge.com/");
		driver.manage().window().maximize();
	}

}
