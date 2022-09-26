package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.hu.De;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static AndroidDriver<MobileElement> driver;
    static AppiumDriverLocalService service;

    public static AppiumDriver<MobileElement> getDriver(Devices device, App app) throws MalformedURLException {
        driver = new AndroidDriver<>(service.getUrl(), capabilities(device,app));
        return driver;
    }

    public static void runAppium() {

        service = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1").usingAnyFreePort().build();
        service.clearOutPutStreams();
        service.start();

    }
    public static void stopAppium(){
        service.stop();
    }
    public static DesiredCapabilities capabilities(Devices device, App app) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid", device.udid);
        capabilities.setCapability("appium:version", device.version);
        capabilities.setCapability("appium:deviceName", device.deviceName);
        capabilities.setCapability("appium:platformName", device.platformName);
        capabilities.setCapability("noReset", device.noReset);

        capabilities.setCapability("appium:appPackage", app.appPackage);
        capabilities.setCapability("appium:appActivity", app.appActivity);

        return capabilities;
    }
    public static AppiumDriver<?> getDriver(){
        return driver;
    }


}
