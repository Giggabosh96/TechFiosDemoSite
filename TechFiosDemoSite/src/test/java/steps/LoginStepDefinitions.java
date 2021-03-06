package steps;

import java.io.IOException;
import java.sql.ResultSet;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinitions extends TestBase {

	LoginPage loginpage;
	DatabasePage databasePage;

	@Before
	public void beforeRun() {
		init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("^user is on TechFios Login Site$")
	public void user_is_on_TechFios_Login_Site() {
		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		loginpage.enterUsername(username);
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginpage.enterPassword(password);
	}

	@And("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
		loginpage.ClickSignInButton();
	}

	@When("^user enters \"([^\"]*)\" from mysql database$")
	public void user_enters_from_mysql_database(String data) throws Throwable {
		switch (data) {
		case "username":
			System.out.println("Username from DB: " + databasePage.getData("username"));
			loginpage.enterUsername(databasePage.getData("username"));
			break;
		case "password":
			System.out.println("Password from DB: " + databasePage.getData("password"));
			loginpage.enterPassword(databasePage.getData("password"));
			break;
		default:
			System.out.println("Unable to enter data");
		}
	}

	@Then("^user will land on Dashboard page$")
	public void user_will_land_on_Dashboard_page() throws IOException {
		loginpage.getPageTitleText();
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpage.getPageTitleText();
		Assert.assertEquals(expectedTitle, actualTitle);
		screenshotMethod(driver);
	}

	@After
	public void closeBrowser() {
		tearDown();
	}
}
