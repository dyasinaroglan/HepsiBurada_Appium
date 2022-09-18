package tests;

import base.BaseClass;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Driver;

import static java.lang.Thread.sleep;
import static utils.Locators.*;

public class Scenario2 extends Driver {

    BaseClass baseClass = new BaseClass();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 45);

    @When("Anasayfada süper fiyat,süper teklif'e tıklanır")
    public void anasayfadaSüperFiyatSüperTeklifETıklanır() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(lTümüButton1)).click();

    }

    @Then("Süper fiyat,süper teklif sayfasından bir ürüne gidilir")
    public void süperFiyatSüperTeklifSayfasındanBirÜrüneGidilir() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(lÜrünSelect)).click();
    }

    @Then("Ürün detayda ürünün görseline tıklanır ve yana doğru scroll edilir")
    public void ürünDetaydaÜrününGörselineTıklanırVeYanaDoğruScrollEdilir() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(lPicturesClick));
        sleep(2000);
        baseClass.swipeScroll();

    }

    @Then("Görsel ekranı kapatılır")
    public void görselEkranıKapatılır() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(lGorselClose)).click();

    }

    @Then("Ürün detaydan favori butonuna basılır")
    public void ürünDetaydanFavoriButonunaBasılır() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(lFavoriButton));
    }

    @Then("Açılan login sayfasından login olunur ve login olunduğu kontrol edilir")
    public void açılanLoginSayfasındanLoginOlunurVeLoginOlunduğuKontrolEdilir() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(lUsername)).sendKeys("");
        wait.until(ExpectedConditions.elementToBeClickable(lGirisYapButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(lPassword)).sendKeys("");
        wait.until(ExpectedConditions.elementToBeClickable(lGirisYapButton2)).click();
        sleep(3000);
        MobileElement element = (MobileElement) Driver.getDriver().findElement(lTextMessage);
        sleep(1000);
        try {
            Assert.assertTrue(element.isDisplayed());
            System.out.println("Login olundu");
        }catch (Exception e) {
            System.out.println("Login olunamadı");
        }
        wait.until(ExpectedConditions.elementToBeClickable(lTamamButton)).click();

    }

    @And("Beğendiklerim sayfasına gidilip ürünün beğendiklerime eklendi görülür.")
    public void beğendiklerimSayfasınaGidilipÜrününBeğendiklerimeEklendiGörülür() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(lBackButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(lListelerimButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(lBegendiklerimButton)).click();
        sleep(3000);
        WebElement element = Driver.getDriver().findElement(lBegendiklerimBox);
        try {
            Assert.assertTrue(element.isDisplayed());
            System.out.println("Ürün begendiklerime eklendi");
        }catch (Exception e) {
            System.out.println("Ürün begendiklerime eklenemedi");
        }

    }
}
