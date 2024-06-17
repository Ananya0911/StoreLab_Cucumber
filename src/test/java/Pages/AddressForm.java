package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm {
    AndroidDriver driver;

    @FindBy(xpath = "  //android.widget.ScrollView/android.widget.EditText[1]")
    WebElement enterAddress;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[3]")
    WebElement enterCity;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[4]")
    WebElement enterDropdown;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[5]")
    WebElement enterZipCode;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[6]")
    WebElement enterFirstName;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[7]")
    WebElement enterLastName;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Save\"]")
    WebElement save;


    // Constructor
    public AddressForm(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterAddress(String address) {
        enterAddress.sendKeys(address);
    }

    public void enterCity(String city) {
        enterCity.sendKeys(city);
    }

    public void enterDropdown(String country) {
        enterDropdown.sendKeys(country);
    }

    public void enterZipCode(String zip_code) {
        enterZipCode.sendKeys(zip_code);
    }

    public void enterFirstName(String first_name) {
        enterFirstName.sendKeys(first_name);
    }
    public void enterLastName(String last_name) {
        enterLastName.sendKeys(last_name);
    }

    public void clickSave() {
        save.click();
    }

   }
