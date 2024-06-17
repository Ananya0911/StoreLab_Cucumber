package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SignInPage {
    AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='StoreLab']")
    WebElement openStoreLabapp;

    @FindBy(xpath = "//android.view.View[@content-desc='account']")
    WebElement clickCustomerProfile;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Sign In\"]")
    WebElement clickSignIn;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    WebElement email1;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    WebElement pass ;

    @FindBy(xpath = "//android.widget.TextView[@text='Sign In'][1]")
    WebElement clickSignIn1;

    @FindBy(xpath = "//android.widget.TextView[@text='Shop Our Spring Sale!']")
    WebElement shop;

    @FindBy(xpath = "//android.widget.TextView[@text='Day Bed Four']")
    WebElement selectItem;

    @FindBy(xpath = "//android.widget.TextView[@text='Add to cart']")
    WebElement addCart;

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[2]")
    WebElement openCart;

    @FindBy(xpath = "//android.widget.TextView[@text='Checkout']")
    WebElement checkOut;

    @FindBy(xpath = "//android.widget.TextView[@text='Add']")
    WebElement openShippingpage;

    // Constructor
    public SignInPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openStoreLabapp() {
        openStoreLabapp.click();
    }

    public void clickCustomerProfile() {
        clickCustomerProfile.click();
    }

    public void clickSignIn() {
        clickSignIn.click();
    }
    public void enterEmail1 (String emailid) {

        email1.sendKeys(emailid);
    }

    public void enterPassword1(String password) {
        pass.sendKeys(password);
    }


    public void clickSignIn1() {
        clickSignIn1.click();
    }

    public void shop() {
        shop.click();
    }

    public void selectItem() {
        selectItem.click();
    }

    public void addCart() {
        addCart.click();
    }

    public void openCart() {
        openCart.click();
    }

    public void checkOut() {
        checkOut.click();
    }

    public void openShippingpage() {
        openShippingpage.click();
    }

}

