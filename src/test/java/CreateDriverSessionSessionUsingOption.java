import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CreateDriverSessionSessionUsingOption {
    public static void main(String[] args) throws MalformedURLException {
        // Android...
        final String APP_ANDROID_URL = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "test" +
                File.separator + "resources" +
                File.separator + "appAndroid" +
                File.separator + "ApiDemos-debug.apk";
        UiAutomator2Options optionsAndroid = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("pixel_5")
                .setAutomationName("UiAutomator2")
                .setUdid("emulator-5554")
                .setAvd("Pixel_5")
                .setAvdLaunchTimeout(Duration.ofMillis(180000))
                .setAppPackage("io.appium.android.apis")
                .setAppActivity("io.appium.android.apis.accessibility.CustomViewAccessibilityActivity")
                .setApp(APP_ANDROID_URL);

        URL urlAndroid = new URL("http://0.0.0.0:4723");

        AppiumDriver driverAndroid = new AndroidDriver(urlAndroid,optionsAndroid);

        // iOS...
        /*final String APP_IOS_URL = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "test" +
                File.separator + "resources" +
                File.separator + "appIOS" +
                File.separator + "UIKitCatalog-iphonesimulator.app";
        XCUITestOptions optionsIOS = new XCUITestOptions()
                .setDeviceName("iPhone 13 Pro Max")
                .setAutomationName("XCUITest")
                .setApp(APP_IOS_URL);

        URL urlIOS = new URL("http://0.0.0.0:4723");

        AppiumDriver driverIOS = new AndroidDriver(urlIOS,optionsIOS);*/
    }
}
