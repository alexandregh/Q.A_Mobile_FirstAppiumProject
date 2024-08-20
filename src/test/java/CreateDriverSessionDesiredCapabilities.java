import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionDesiredCapabilities {
    public static void main(String[] args) throws MalformedURLException {
        // Android...
        final String APP_ANDROID_URL = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "test" +
                File.separator + "resources" +
                File.separator + "appAndroid" +
                File.separator + "ApiDemos-debug.apk";
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:deviceName", "pixel_5");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("appium:app", APP_ANDROID_URL);

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new AndroidDriver(url,capabilities);

        // iOS...
        /*final String APP_IOS_URL = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "test" +
                File.separator + "resources" +
                File.separator + "appIOS" +
                File.separator + "UIKitCatalog-iphonesimulator.app";
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("udid", "FDDAF4BC-2C59-4E30-BC16-B05C16E3D29D");
        capabilities.setCapability("app", APP_IOS_URL);

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new IOSDriver(url,capabilities);*/
    }
}
