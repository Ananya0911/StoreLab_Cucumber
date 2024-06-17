package StepDef;

import Pages.AddressForm;
import Pages.SignInPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.Hooks;

public class ShippingAddressFormSteps {

    private AndroidDriver driver;
    private SignInPage signInPage;
    private AddressForm addressForm;
    private String emailid, password, address, city, country, zip_code, first_name, last_name;

    // Constructor to initialize AndroidDriver using Hooks
    public ShippingAddressFormSteps() {
        this.driver = Hooks.getDriver();
    }

    @Given("User signs in using {string} and {string}")
    public void user_signs_in_using_and(String emailid, String password) {
        this.emailid = emailid;
        this.password = password;

        // Initialize SignInPage and perform necessary actions to sign in
        signInPage = new SignInPage(driver);
        signInPage.openStoreLabapp();
        signInPage.clickCustomerProfile();
        signInPage.clickSignIn();
        signInPage.enterEmail1(emailid);
        signInPage.enterPassword1(password);
        signInPage.clickSignIn1();
        signInPage.shop();
        signInPage.selectItem();
        signInPage.addCart();
        signInPage.openCart();
        signInPage.checkOut();
    }

    @And("User is on the shipping address form")
    public void user_is_on_the_shipping_address_form() {
        // Navigate to the shipping address form
        signInPage.openShippingpage();
    }

    @When("User enters the address {string}")
    public void user_enters_the_address(String address) {
        // Initialize AddressForm and enter address
        addressForm = new AddressForm(driver);
        this.address = address;
        addressForm.enterAddress(address);
    }

    @And("User enters the city {string}")
    public void user_enters_the_city(String city) {
        // Enter city in the address form
        this.city = city;
        addressForm.enterCity(city);
    }

    @And("User enters the country {string}")
    public void user_enters_the_country(String country) {
        // Enter country in the address form
        this.country = country;
        addressForm.enterDropdown(country);
    }

    @And("User enters the zip code {string}")
    public void user_enters_the_zip_code(String zip_code) {
        // Enter zip code in the address form
        this.zip_code = zip_code;
        addressForm.enterZipCode(zip_code);
    }

    @And("User enters the first name {string}")
    public void user_enters_the_first_name(String first_name) {
        // Enter first name in the address form
        this.first_name = first_name;
        addressForm.enterFirstName(first_name);
    }

    @And("User enters the last name {string}")
    public void user_enters_the_last_name(String last_name) {
        // Enter last name in the address form
        this.last_name = last_name;
        addressForm.enterLastName(last_name);
    }

    @Then("User submits the address form")
    public void user_submit_the_address_form() {
        // Submit the address form
        addressForm.clickSave();
    }
}
