import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionDesiredCapabilities {
    public static void main(String[] args) throws MalformedURLException {
        final String APP_ANDROID_URL = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "test" +
                File.separator + "resources" +
                File.separator + "appAndroid" +
                File.separator + "ApiDemos-debug.apk";
        DesiredCapabilities capabilitiesAndroid = new DesiredCapabilities();

        capabilitiesAndroid.setCapability("platformName","Android");
        capabilitiesAndroid.setCapability("appium:deviceName", "pixel_5");
        capabilitiesAndroid.setCapability("appium:automationName", "UiAutomator2");
        capabilitiesAndroid.setCapability("appium:udid", "emulator-5554");
        capabilitiesAndroid.setCapability("appium:avd", "Pixel_5");
        capabilitiesAndroid.setCapability("appium:avdLaunchTimeout", 180000);
        capabilitiesAndroid.setCapability("appium:newCommandTimeout", 300);
        capabilitiesAndroid.setCapability("appium:appPackage", "io.appium.android.apis");
        capabilitiesAndroid.setCapability("appium:appActivity", "io.appium.android.apis.accessibility.CustomViewAccessibilityActivity");
        capabilitiesAndroid.setCapability("appium:app", APP_ANDROID_URL);

        URL urlAndroid = new URL("http://0.0.0.0:4723");

        AppiumDriver driverAndroid = new AndroidDriver(urlAndroid,capabilitiesAndroid);
        System.out.println("session id: " + driverAndroid.getSessionId());

        // iOS...
        /*final String APP_IOS_URL = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "test" +
                File.separator + "resources" +
                File.separator + "appIOS" +
                File.separator + "UIKitCatalog-iphonesimulator.app";
        DesiredCapabilities capabilitiesIOS = new DesiredCapabilities();

        capabilitiesIOS.setCapability("platformName", "iOS");
        capabilitiesIOS.setCapability("deviceName", "iPhone 11");
        capabilitiesIOS.setCapability("automationName", "XCUITest");
        capabilitiesIOS.setCapability("udid", "FDDAF4BC-2C59-4E30-BC16-B05C16E3D29D");
        capabilitiesIOS.setCapability("app", APP_IOS_URL);

        URL urlIOS = new URL("http://0.0.0.0:4723");

        AppiumDriver driverIOS = new IOSDriver(urlIOS,capabilitiesIOS);*/
    }
}
