package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class Utils {

    public static AppiumDriver<MobileElement> openApp(Devices device, App app) throws MalformedURLException {
        Driver.runAppium();
        return Driver.getDriver(device,app);
    }
}
