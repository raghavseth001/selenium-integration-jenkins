package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Account_login {
	
	WebDriver driver;
	public  Account_login(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID,using="user_login")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.ID, using="wp-submit")
	@CacheLookup
	WebElement submit;
	
	
	public void login_TSI_UAT(String uid, String pass){
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit.click();
	}
	
	

}
