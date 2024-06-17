package util;

import StepDef.Swipeactions;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Hooks {
    private static AndroidDriver driver;

    @Before
    public void beforeScenario() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("app", "C:\\Users\\dmohanty\\Downloads\\app.storelab.storelabmarketplace_2024-05-01.apk");
        capabilities.setCapability("appium:appPackage", "app.storelab.storelabmarketplace");
        capabilities.setCapability("appium:appActivity", "app.storelab.storelabmarketplace.presentation.MainActivity");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("appWaitActivity", "*");
        capabilities.setCapability("platformVersion", "12L");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, capabilities);

        // Optional: Perform any initial setup actions after launching the app
        Swipeactions.swipe_toalocations(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void tearDown() {
        if (driver != null) {
//           driver.close();
          //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
           // driver.closeApp();
        }
    }


    public static  AndroidDriver getDriver() {
        return driver;
    }


}
