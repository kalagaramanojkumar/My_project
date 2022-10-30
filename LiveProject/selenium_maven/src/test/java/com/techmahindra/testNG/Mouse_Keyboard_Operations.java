package com.techmahindra.testNG;

import org.testng.annotations.Test;

import com.techmahindra.selenium.java.BasePage;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Mouse_Keyboard_Operations{
	public WebDriver driver;
	public Actions a;
	
  @Test(enabled=false)
  public void dragNdrop() {
	  driver.switchTo().frame(0);
	   WebElement drag = driver.findElement(By.id("draggable"));
	   WebElement drop=driver.findElement(By.id("droppable"));
	 //	a.dragAndDrop(drag, drop).build().perform();
	   a.clickAndHold(drag).moveToElement(drop).release().build().perform();
  }
  @Test(enabled=false)
  public void resizeObject() {
	  driver.switchTo().frame(0);
	  WebElement drag=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	//  a.dragAndDropBy(drag, 50, 150).build().perform();
	  a.clickAndHold(drag).moveByOffset(200,50).build().perform();
  }
  
  
  @Test(enabled=false)
  public void rightClickOnElement() {
	  WebElement element=driver.findElement(By.linkText("Sortable"));
	  a.contextClick(element).perform();//Right Click is called contextClick()method in actions class
  }
  
  @Test
  public void slider() {
	  driver.switchTo().frame(0);
	  WebElement drag=driver.findElement(By.xpath("//div[@id='slider']/span"));
	 // a.clickAndHold(drag).moveByOffset(550, 0).release().build().perform();//to use slider 1st way
      a.dragAndDropBy(drag, 350, 0).perform();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		a=new Actions(driver);
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
  }

}
