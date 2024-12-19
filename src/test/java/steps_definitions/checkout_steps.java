package steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;
import org.example.pages.checkoutPage;

public class checkout_steps {

    checkoutPage checkoutPage = new checkoutPage();

    @An("click the checkout button")
    public void click_checkout_button(){
        checkoutPage.checkoutButton();
    }

    @An("enter user information")
    public void enter_user_information(){
        checkoutPage.textBoxFirstName();
        checkoutPage.textBoxLastName();
        checkoutPage.textBoxPostalCode();
    }

    @And("click continue button")
    public void click_continue_button() {
        checkoutPage.clickContinueButton();
    }

    @And("click finish button")
    public void click_finish_button() {
        checkoutPage.clickFinishButton();
    }
}
