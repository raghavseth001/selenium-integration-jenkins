package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import myLibs.ExcelDataConfig;
import objectRepo.Account_login;
import utilities.Browser_utilities;


public class Verify_valid_Login {
	
	@Test
	public void checkValidUser()
	{
		//this will launch browser and hit the URL
		WebDriver driver=Browser_utilities.startBrowser("firefox","http://demosite.center/wordpress/wp-login.php");
		
		//Created Page object using page factory 
		Account_login login_page=PageFactory.initElements(driver, Account_login.class);
		
		//Call the method
		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\raghavseth\\workspace\\Selenium_PageFactory\\TestData\\testdata_Login.xlsx");
		login_page.login_TSI_UAT(excel.getData(0, 0, 0), excel.getData(0, 0, 1));
	    System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Install"));  
		
		
		
		//login_page.login_TSI_UAT("admin", "demo123");
		
		
		
	}
	

}
