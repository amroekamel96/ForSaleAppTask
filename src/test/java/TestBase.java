import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    public void Android_setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "10.0");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("noReset", "true");
        //caps.setCapability("app", System.getProperty("user.dir")+"/apps/4sale.apk");
        caps.setCapability("appPackage","com.forsale.forsale");
        caps.setCapability("appActivity","com.forsale.app.features.maincontainer.MainContainerActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public static void tearDown(){
        if(null != driver){
            driver.quit();
        }
    }
}