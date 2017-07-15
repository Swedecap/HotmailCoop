package pageobjectmodel;

import org.openqa.selenium.By;

import utility.MSN_Driver;

public class Inbox_enter extends MSN_Driver {

	By email_userfield = By.className("placeholder");
	By password_textfield = By.id("i0118");
	By next_button = By.id("idSIButton9");
	By sign_in = By.id("idSIButton9");
	String email = "larry_barry@hotmail.co.uk";
	String Pwd = "Maroon5jpg";

	public void launch_browser() {
		driver.get("https://www.hotmail.com");

	}

	public void email_address() {
		driver.findElement(email_userfield).sendKeys(email);
	}

	public void click_next_button() {
		driver.findElement(next_button).click();
	}

	public void password() {
		driver.findElement(password_textfield).sendKeys(Pwd);
	}

	public void sign_in_button() {
		driver.findElement(sign_in).click();
		
	}

	public void my_mailbox_successfully_open_up(){
	}

public void end_session() {
}
	
}


