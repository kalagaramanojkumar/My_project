package com.techmahindra.ecommerce.pageUI;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.techmahindra.ecommerce.basepage.BasePage;
//import com.techmahindra.ecommerce.home.TC001_CustomerRegistration;


public class CreateLoginAccount extends BasePage {
	
	public static final Logger log=Logger.getLogger(CreateLoginAccount.class.getName());
	
	@FindBy(linkText = "Sign in") WebElement linkSignIN;
	@FindBy(id = "email_create") WebElement txtEmailID;
	@FindBy(id="SubmitCreate") WebElement btnCreateAnAccount;
	@FindBy(xpath="//h1[text()='Create an account']") WebElement txtCreateAnAccount;
	@FindBy(id="id_gender1") WebElement radioMr;
	@FindBy(id="customer_firstname") WebElement txtFirstName;
	@FindBy(id="customer_lastname") WebElement txtLastName;
	@FindBy(id="passwd") WebElement txtPassword;
	@FindBy(id="days") WebElement dropDownDays;
	@FindBy(id="months") WebElement dropDownMonths;
	@FindBy(id="years") WebElement dropDownYears;
	@FindBy(id="address1") WebElement txtAddress1;
	@FindBy(id="city") WebElement txtCity;
	@FindBy(id="id_state") WebElement dropDownState;
	@FindBy(id="postcode") WebElement txtZipCode;
	@FindBy(id="id_country") WebElement dropDownCountry;
	@FindBy(id="phone_mobile") WebElement txtMobile;
	@FindBy(id="alias") WebElement txtAliasAddress;
	@FindBy(id="submitAccount") WebElement btnRegister;
	@FindBy(xpath = "//h1[text()='My account']") WebElement txtMyAccount;
	@FindBy(linkText = "Sign out") WebElement linkSignOut;
	
	
	
	public CreateLoginAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void createAccount() throws Exception{
		linkSignIN.click();
		log.info("Clicked on Sign IN Button with object: "+linkSignIN.toString());
		txtEmailID.sendKeys(getData("firstname")+getData("lastname")+randomNumber()+getData("domainname"));
		log.info("Entering Email ID: "+txtEmailID.getAttribute("value")+"using object:"+txtEmailID.toString());
		btnCreateAnAccount.click();
		log.info("Clicking on Create An Account: "+btnCreateAnAccount.toString());
		Thread.sleep(8000);
		assertEquals(txtCreateAnAccount.getText(), "CREATE AN ACCOUNT");
		log.info("Verifying customer info page by using object"+txtCreateAnAccount.toString());
		radioMr.click();
		log.info("Clicking on "+"Mr"+ "radio button by using object: "+radioMr.toString());
		txtFirstName.sendKeys("Manoj");
		log.info("Entering First Name by using object: "+txtFirstName.toString());
		txtLastName.sendKeys("K");
		log.info("Entering Last Name by using object: "+txtLastName.toString());
		txtPassword.sendKeys("abc@123");
		log.info("Entering Password by using object: "+txtPassword.toString());
		selectOption(dropDownDays, 3);
		log.info("Selected a Day by using object: "+dropDownDays.toString());
		selectOption(dropDownMonths, 3);
		log.info("Selected a Month by using object: "+dropDownMonths.toString());
		selectOption(dropDownYears, 3);
		log.info("Selected a Year by using object: "+dropDownYears.toString());
		txtAddress1.sendKeys(getData("address1"));
		log.info("Entering Address by using object: "+txtAddress1.toString());
		txtCity.sendKeys(getData("city"));
		log.info("Entering City by using object: "+txtCity.toString());
		selectOption(dropDownState, 3);
		log.info("Selected a State by using object: "+dropDownState.toString());
		txtZipCode.sendKeys("23421");
		log.info("Entering ZipCode by using object: "+txtZipCode.toString());
		selectOption(dropDownCountry, 1);
		log.info("Selected a Country by using object: "+dropDownCountry.toString());
		txtMobile.sendKeys("5443234546");
		log.info("Entering MobileNumber by using object: "+txtMobile.toString());
		txtAliasAddress.sendKeys("UP");
		log.info("Entering AliasAddress by using object: "+txtAliasAddress.toString());
		btnRegister.click();
		log.info("Clicking on Register:  "+btnRegister.toString());
		Thread.sleep(9000);
		assertEquals(txtMyAccount.getText(), "MY ACCOUNT");
		log.info("Verified My Account Page by using object:  "+txtMyAccount.toString());
		linkSignOut.click();
		log.info("Clicking on SignOut Button using object:  "+linkSignIN.toString());
		
		
	}
	
	

}
