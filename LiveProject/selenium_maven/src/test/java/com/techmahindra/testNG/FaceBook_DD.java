package com.techmahindra.testNG;

import org.testng.annotations.Test;

import com.techmahindra.selenium.java.BasePage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FaceBook_DD  extends BasePage {
	
  @Test
  public void f() throws Exception {
	  
	  driver.findElement(By.linkText("Create New Account")).click();
	  Thread.sleep(5000);
		/*
		 * new Select(driver.findElement(By.xpath("//select[@name='birthday_month']"))).
		 * selectByIndex(6); Thread.sleep(5000); new
		 * Select(driver.findElement(By.xpath("//select[@name='birthday_month']"))).
		 * selectByValue("9"); Thread.sleep(5000); new
		 * Select(driver.findElement(By.xpath("//select[@name='birthday_month']"))).
		 * selectByVisibleText("Dec");
		 */
	  WebElement ddMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	  Select monthDD = new Select(ddMonth);
	  monthDD.selectByIndex(6);
	  Thread.sleep(5000);
	  monthDD.selectByValue("9");
	  Thread.sleep(5000);
	  monthDD.selectByVisibleText("Dec");
	 
	  
  
  }
  @BeforeTest
  public void beforeTest() {
	  browserLaunch("chrome", "http://facebook.com");
  }

@AfterTest
public void afterTest() {
	driver.close();
	driver.quit();
}

}
