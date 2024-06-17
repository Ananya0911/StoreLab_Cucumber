package StepDef;

import Pages.SignUpPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.Hooks;

public class CustomerSignUpSteps {
    private AndroidDriver driver;
    private SignUpPage page;
    private String firstName, lastName, email, password, confirmPassword, message;

    public CustomerSignUpSteps() {
        this.driver = Hooks.getDriver();
    }


    @Given("I am on the sign-up page")
    public void i_am_on_the_sign_up_page() {
        // Navigate to the sign-up page within your app
        page = new SignUpPage(driver);
        page.openStoreLabapp();
        page.clickCustomerProfile();
        page.clickSignIn();
        page.clickSignUp();
    }

    @When("I enter the first name {string}")
    public void i_enter_the_first_name(String firstName) {
        this.firstName = firstName;
        page.enterFirstName(firstName);
    }

    @And("I enter the last name {string}")
    public void i_enter_the_last_name(String lastName) {
        this.lastName = lastName;
        page.enterLastName(lastName);
    }

    @And("I enter the email {string}")
    public void i_enter_the_email(String email) {
        this.email = email;
        page.enterEmailId(email);
    }

    @And("I enter the password {string}")
    public void i_enter_the_password(String password) {
        this.password = password;
        page.enterPassword(password);

    }

    @And("I enter the confirm password {string}")
    public void i_enter_the_confirm_password(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        page.enterConfirmPassword(confirmPassword);
    }

    @And("I submit the registration form")
    public void i_submit_the_registration_form() {
        page.clickSignUp1();
    }

    @Then("I should see {string}")
    public void i_should_see(String message) {
        this.message = message;
        page.verifySuccessMessage(message);
        page.close();

    }


}
