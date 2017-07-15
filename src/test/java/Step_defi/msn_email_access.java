package Step_defi;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Inbox_enter;
import utility.MSN_Driver;

public class msn_email_access {
MSN_Driver msn_email_step_def = new MSN_Driver();
Inbox_enter email_access = new Inbox_enter();


@Given("^I have navigated to the Sign in Screen$")
public void i_have_navigated_to_the_Sign_in_Screen() throws Throwable {
	 msn_email_step_def.set_driver("firefox");
	 //msn_email_step_def.browser_setting();
	 email_access.launch_browser();  }


@Given("^i enter my email address into the field provided$")
public void i_enter_my_email_address_into_the_field_provided() throws Throwable {
	email_access.email_address();}

@When("^I select the next button the password screen appears$")
public void i_select_the_next_button_the_password_screen_appears() throws Throwable {
    email_access.click_next_button();}

@When("^i enter my password into the next input field$")
public void i_enter_my_password_into_the_next_input_field() throws Throwable {
	email_access.password(); }

@When("^select the Sign in button$")
public void select_the_Sign_in_button() throws Throwable {
    email_access.sign_in_button(); }

@Then("^my mailbox successfully open up$")
public void my_mailbox_successfully_open_up() throws Throwable {
    
}
}
