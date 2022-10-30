package com.techmahindra.testNG;

import org.testng.annotations.Test;
import com.techmahindra.selenium.java.BasePage;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;

public class Facebook_Login_JSE extends BasePage {
  @Test
  public void f() {
   JavascriptExecutor js =(JavascriptExecutor)driver;
   js.executeScript("document.getElementById('email').value='Manoj'");
   js.executeScript("document.getElementById('pass').value='Kumar@123'");
  
  
  }
  @BeforeTest
  public void beforeTest() throws Exception{
  browserLaunch("chrome","https://facebook.com");
  Thread.sleep(5000);
  
  }

  @AfterTest
  public void afterTest() {
  driver.close();
  driver.quit();
  }
  

}
