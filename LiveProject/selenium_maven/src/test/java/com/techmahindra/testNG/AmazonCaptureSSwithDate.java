package com.techmahindra.testNG;

import org.testng.annotations.Test;
import com.techmahindra.selenium.java.BasePage;
import org.testng.annotations.BeforeTest;

import java.io.File;
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

public class AmazonCaptureSSwithDate extends BasePage{
  @Test
  public void dateNTimeScreenshotPractise()  throws Exception{
	  List<WebElement> links = driver.findElements(By.partialLinkText("See all offers"));
	  System.out.println("Available No of Links are "+links.size());
	  for(int i=0;i<links.size();i++) {
		  System.out.println("Link Name "+links.get(i).getText());
			/* links.get(i).click(); */
	  }
		/* links = driver.findElements(By.partialLinkText("See all offers")); */
  if(!(links.size()==0)) {
	  Date  dt=new Date();
	  SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyy-hh-mm-ss");
	   File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(scr, new File("C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\"+ dateformat.format(dt) +"Amazon.jpeg"));
  }
  }
  @BeforeTest
  public void beforeTest() {
	  browserLaunch("Chrome", "https://Amazon.in");
  }

  @AfterTest
  public void afterTest() throws Exception{
	  Thread.sleep(3000);
	  driver.close();
	  driver.quit();
  }

}
