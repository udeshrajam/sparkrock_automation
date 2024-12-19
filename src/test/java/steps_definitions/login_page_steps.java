package steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.loginPage;

public class login_page_steps {
    loginPage loginPage = new loginPage();


    @Given("enter the {string} username")
    public void enter_username(String userType) throws InterruptedException {
        loginPage.userNameTextField(userType);
    }

    @When("enter the password")
    public void enter_password() throws InterruptedException {
        loginPage.passwordTextField();
    }

    @And("click the login button")
    public void click_login_button() throws InterruptedException {
        loginPage.loginButton();
    }

    @Then("user logouts from application")
    public void user_logouts_from_application() {
        loginPage.userLogout();
    }
}
