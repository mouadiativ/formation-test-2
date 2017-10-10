package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	public void she_provides_the_first_name_as(String firstName) throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys(firstName);
	}

	public void she_provides_the_last_name_as(String lastName) throws Throwable {
		driver.findElement(By.id("last_name")).sendKeys(lastName);
	}

	public void she_provides_the_email_as(String email) throws Throwable {
		driver.findElement(By.id("invitation_email")).sendKeys(email);
	}

	public void she_signs_up() throws Throwable {
		driver.findElement(By.cssSelector("input.btn")).click();
	}
}
