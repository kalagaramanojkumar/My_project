package com.techmahindra.ecommerce.home;

import org.testng.annotations.Test;
import com.techmahindra.ecommerce.basepage.BasePage;
import com.techmahindra.ecommerce.pageUI.CreateLoginAccount;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TC001_CustomerRegistration extends BasePage {
	
	public static final Logger log=Logger.getLogger(TC001_CustomerRegistration.class.getName());
	
  @Test
  public void customerRegistration() throws Exception {
	  log.info("*****Starting TC001_Customer Registration*****");
	  CreateLoginAccount login=new CreateLoginAccount(driver);
	  login.createAccount();
	  log.info("*****End of TC001_Customer Registration*****");
  }
  @BeforeClass
  public void beforeTest() throws Exception {
	  browserLaunch(getData("browser"), getData("url"));
	  
  }
@AfterClass
public void endTest() {
	closeBrowser();
}
private void closeBrowser() {
	driver.quit();
	extent.endTest(test);
	extent.flush();
}


}
