package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MSN_Driver {
	
public static WebDriver driver;

public void set_driver (String browser) {
	
	if (driver == null){
	if (browser.equalsIgnoreCase("firefox")) {
 System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
 driver = new FirefoxDriver();



	}
	}
}
}
