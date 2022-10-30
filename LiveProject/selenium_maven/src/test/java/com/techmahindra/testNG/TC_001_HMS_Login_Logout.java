package com.techmahindra.testNG;

import org.testng.annotations.Test;
import com.techmahindra.selenium.java.BasePage;
import com.techmahindra.selenium.java.PageUI;

import atu.testrecorder.ATUTestRecorder;
import org.testng.annotations.BeforeTest;

public class TC_001_HMS_Login_Logout extends BasePage {

	public ATUTestRecorder recorder;

	@Test(description = "This test case is to verify login and logout in hms ")
	public void hmsLoginLogout() throws Exception {
		PageUI p = new PageUI(driver);
		p.hmsLogin();
		p.hmsLogout();
		recorder.stop();
	}

	@BeforeTest
	public void beforeTest() throws Exception  {
		recorder=new ATUTestRecorder("C:\\Users\\612627350\\eclipse-workspace\\Recordings", "HMSLogin", false);
		recorder.start();
		browserLaunch("Chrome", "http://seleniumbymahesh.com");
		// browserLaunch("Edge", "http://spicejet.com");

	}

}
