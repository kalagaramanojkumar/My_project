package com.techmahindra.selenium.java;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertiesFIle {
	
    public static final String path="./config.properties";
	public static String getdata(String key) throws Exception {
		File f=new File(path);
		FileInputStream fs=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fs);
		return p.getProperty(key);
	}
	
	public static void main(String[] args) throws Exception{

		System.out.println(getdata("browser"));
		System.setProperty("webdriver.chrome.driver","C:\\Users\\612627350\\OneDrive - BT Plc\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(getdata("prodURL")); 
		driver.manage().window().maximize();
		driver.findElement(By.name(getdata("usernameLoc"))).sendKeys(getdata("username"));
		driver.findElement(By.name(getdata("passwordLoc"))).sendKeys(getdata("password"));
		driver.findElement(By.name(getdata("LoginLoc"))).click();
		
	}

	

}
