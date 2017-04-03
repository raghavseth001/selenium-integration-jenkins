package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_utilities {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browserName, String url)
	{
		
			if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Firefox Drivers-Gecko\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			else if(browserName.equalsIgnoreCase("chrome"))
			{
				
			}
			else if(browserName.equalsIgnoreCase("IE"))
			{
				driver=new InternetExplorerDriver();
				
			}
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
		
		
	}
	

}
