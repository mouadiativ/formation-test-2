package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.LandingPage;
import pages.SignupPage;

public class ClientSteps {
	WebDriver driver = new FirefoxDriver();
	@Given("^the user is on landing page$")
	public void setup() throws Throwable {
	driver.get("https://www.heroku.com/home");
	driver.manage().window().maximize();
	}
	@When("^she chooses to sign up$")
	public void she_chooses_to_sign_up() throws Throwable {
	new LandingPage(driver).she_chooses_to_sign_up();
	}
	@And("^she provides the first name as ([^\"]*)$")
	public void she_provides_the_first_name_as(String firstName) throws Throwable {
	new SignupPage(driver).she_provides_the_first_name_as(firstName);
	}
	@And("^she provides the last name as ([^\"]*)$")
	public void she_provides_the_last_name_as(String lastName) throws Throwable {
	new SignupPage(driver).she_provides_the_last_name_as(lastName);
	}
	@And("^she provides the email as ([^\"]*)$")
	public void she_provides_the_email_as(String email) throws Throwable {
	new SignupPage(driver).she_provides_the_email_as(email);
	}
	
	@And("^she signs-up$")
	public void she_signs_up() throws Throwable {
	new SignupPage(driver).she_signs_up();
	}
	@Then("^she should be logged in to the application$")
	public void she_should_be_logged_in_to_the_application() throws Throwable {
	Assert.assertTrue(new HomePage(driver).isSignOutLinkDisplayed());
	}
}
