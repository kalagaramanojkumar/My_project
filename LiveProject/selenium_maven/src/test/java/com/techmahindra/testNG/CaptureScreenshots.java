package com.techmahindra.testNG;

import org.testng.annotations.Test;
import com.techmahindra.selenium.java.BasePage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CaptureScreenshots extends BasePage {
	@Test(enabled = false)
	public void normalScreenshot() throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\firstssbymanoj.png"));
	}

	@Test(enabled = false)
	public void conditionBasedScreenshot() throws Exception {
		List<WebElement> links = driver.findElements(By.partialLinkText("New Batches"));
		System.out.println("Available Links are " + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println("Link Name " + links.get(i).getText());
			links.get(i).click();
		}
		if (!(links.size() == 0)) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\conditionbasedScreenshot.jpeg"));
		}
	}

	@Test
	public void dateNtimeScreenshot() throws Exception {
		List<WebElement> links = driver.findElements(By.partialLinkText("New Batches"));
		System.out.println("Available Links are " + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println("Link Name " + links.get(i).getText());
			links.get(i).click();
		}
		if (!(links.size() == 0)) {
			Date dt=new Date();
			DateFormat dtformat= new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\"+ dtformat.format(dt)+" DateNTimeBasedSS.jpeg"));
		}
		Thread.sleep(5000);
	}
	
	@BeforeTest
	public void beforeTest() throws Exception {
		browserLaunch("chrome", "http://www.seleniumbymahesh.com");
		Thread.sleep(5000);
	}
@AfterTest
public void afterTest() {
	driver.close();
	driver.quit();
}
}
