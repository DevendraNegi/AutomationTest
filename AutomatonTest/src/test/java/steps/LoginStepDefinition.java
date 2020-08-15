package steps;

import org.junit.Assert;

import com.automation.qa.pages.LoginPage;
import com.automation.qa.utils.LoginHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	@Given("login page for facebook")
	public void login_page_for_facebook() {
		String title=LoginPage.validateTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	  
	}

	@When("I pass my login credentials")
	public void i_pass_my_login_credentials() {
	   LoginPage.enterCredentials(LoginHelper.getUserName(),LoginHelper.getPassWord());
	}

	@Then("I see facebook home page")
	public void i_see_facebook_home_page() {
	
	}
	
}
