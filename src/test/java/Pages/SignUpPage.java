package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	AndroidDriver driver;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"StoreLab\"]")
	WebElement openStoreLabapp;

	@FindBy(xpath = "//android.view.View[@content-desc=\"account\"]")
	WebElement clickCustomerProfile;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Sign In\"]")
	WebElement clickSignIn;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Sign Up\"]")
	WebElement clickSignUp;

	@FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]")
	WebElement enterFirstName;

	@FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText[2]")
	WebElement enterLastName;

	@FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText[3]")
	WebElement enterEmailId;

	@FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText[4]")
	WebElement enterPassword;

	@FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText[5]")
	WebElement enterConfirmPassword;

	@FindBy(xpath = "(//android.widget.TextView[@text=\"Sign Up\"])[1]")
	WebElement clickSignUp1;

	@FindBy(xpath = "//android.widget.TextView[@text=\"User created, Please log in!\"]")
	WebElement verifySuccessMessage;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Close\"]")
	WebElement close;

	// Constructor
	public SignUpPage(AndroidDriver driver) {
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

	public void clickSignUp() {
		clickSignUp.click();
	}

	public void enterFirstName(String firstName) {

		enterFirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		enterLastName.sendKeys(lastName);
	}

	public void enterEmailId(String email) {
		enterEmailId.sendKeys(email);
	}

	public void enterPassword(String password) {
		enterPassword.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		enterConfirmPassword.sendKeys(confirmPassword);
	}

	public void clickSignUp1() {
		clickSignUp1.click();
	}

	public void verifySuccessMessage(String message) {
		String actualMessage = verifySuccessMessage.getText();
		if (!actualMessage.equals(message)) {
			throw new AssertionError("Expected message: " + message + " but got: " + actualMessage);
		}
	}

	public void close() {
		close.click();
	}


}
