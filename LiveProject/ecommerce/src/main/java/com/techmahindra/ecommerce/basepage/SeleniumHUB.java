package com.techmahindra.ecommerce.basepage;


import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumHUB {

	public static void main(String[] args) throws Exception {
	 DesiredCapabilities ds=new DesiredCapabilities();
	 ds.setBrowserName("chrome");
	 ds.setPlatform(Platform.WINDOWS);
	 ChromeOptions cp=new ChromeOptions();
	 cp.merge(ds);
	 String hubURL="http://172.20.10.4:4444/wd/hub";
	 WebDriver driver=new RemoteWebDriver(new URL(hubURL), ds);
	 driver.get("http://seleniumbymahesh.com");
	 System.out.println(driver.getTitle());
     driver.manage().window().maximize();
     System.out.println(driver.getTitle());
	}

}
