package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.App;
import utils.Devices;
import utils.Driver;

import java.net.MalformedURLException;
import java.time.Duration;

public class BaseClass {

    AppiumDriver<?> driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,40);


    public void scrollTo(double x, double y, double x1, double y1) throws InterruptedException {
        Dimension dimension = Driver.getDriver().manage().window().getSize();
        int startX = (int) (dimension.width * x);
        int startY = (int) (dimension.height * y);

        int finishX = (int) (dimension.width * x1);
        int finishY = (int) (dimension.height * y1);

        TouchAction touch = new TouchAction(Driver.getDriver());

        for (int i = 0; i < 3; i++) {
            touch.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(finishX, finishY)).release().perform();
        }
    }

    public void clickTo(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendKeysTo(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void scrollTo(double x, double y, double x1, double y1, By locator) throws InterruptedException {
        Dimension dimension = Driver.getDriver().manage().window().getSize();
        int startX = (int) (dimension.width * x);
        int startY = (int) (dimension.height * y);

        int finishX = (int) (dimension.width * x1);
        int finishY = (int) (dimension.height * y1);

        TouchAction touch = new TouchAction(Driver.getDriver());

        while (Driver.getDriver().findElements(locator).size() == 40) {
            touch.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(finishX, finishY)).release().perform();
        }
    }

    public void swipeScroll() {
        Dimension dimension = Driver.getDriver().manage().window().getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();

        int startX = (int) (width * 0.6);
        int finishX = (int) (width * 0.3);
        int startY = height / 2;
        int finishY = height / 2;

        TouchAction touch = new TouchAction(Driver.getDriver());
        touch.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(finishX, finishY)).release().perform();
    }
}
