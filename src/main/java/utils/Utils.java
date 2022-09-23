package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class Utils {
             //appiumDriver return etsin diyorum      //bu Driver ı çalıştırıken bir tane device bir tane de capabilities göndereyim diyorum
    public static AppiumDriver<MobileElement> openApp(Devices device, App app) throws MalformedURLException {
        Driver.runAppium();
        return Driver.getDriver(device,app);   //araya bir methot koymuş oldum

        /*
        OpenApp appiumu çalıştırıyor.
        gönderilen device ve uygulamayı gönderiyor. nereden? Driver class'ındaki getDriver methodundan
         */
    }
}
