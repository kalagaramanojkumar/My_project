package com.techmahindra.testNG;

import org.testng.annotations.Test;
import com.techmahindra.selenium.java.BasePage;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class JqueryDropDown extends BasePage {
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	  WebElement table = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
  List<WebElement> ddValues = table.findElements(By.tagName("input"));
  System.out.println("Total available values in Dropdown: "+ ddValues.size());
  Thread.sleep(5000);
	/*
	 * for(int i=0;i<ddValues.size();i++) { ddValues.get(i).click();//to select all the values in the dropdown
	 * 
	 * }
	 */
  WebElement value = ddValues.get(4);
		  value.click();
 if(value.isSelected()) {
	  System.out.println(value.getAccessibleName());
  }
  }
  @BeforeTest
  public void beforeTest() {
  browserLaunch("chrome","https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
