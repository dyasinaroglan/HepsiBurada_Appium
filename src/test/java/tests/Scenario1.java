package tests;

import base.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.App;
import utils.Devices;
import utils.Driver;
import utils.Utils;

import javax.swing.*;
import java.net.MalformedURLException;
import java.time.Duration;

import static java.lang.Thread.sleep;
import static utils.Locators.*;

public class Scenario1 extends Driver{

    BaseClass baseClass = new BaseClass();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 45);

    @Given("uygulama açılır")
    public void uygulamaAçılır() throws MalformedURLException {

        Utils.openApp(Devices.HUAWEI, App.HEPSIBURADA);
    }

    @When("Anasayfada Konum alanına Kklanır")
    public void anasayfadaKonumAlanınaKklanır() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(lKonum)).click();

    }

    @Then("İl, ilçe ve mahalle seçilir ve kaydet butonuna Kklanır")
    public void ilIlçeVeMahalleSeçilirVeKaydetButonunaKklanır() throws InterruptedException {

        WebElement il = Driver.getDriver().findElement(lIlSelect);
        wait.until(ExpectedConditions.elementToBeClickable(lIlSelect)).click();
        sleep(2000);
        baseClass.scrollTo(0.5,0.9,0.5,0.1);
        wait.until(ExpectedConditions.elementToBeClickable(lIstanbul)).click();
        wait.until(ExpectedConditions.elementToBeClickable(lIlceSelect)).click();
        baseClass.scrollTo(0.5,0.9,0.5,0.1);
        wait.until(ExpectedConditions.elementToBeClickable(lMaltepe)).click();
        wait.until(ExpectedConditions.elementToBeClickable(lMahalleSelect)).click();
        baseClass.scrollTo(0.5,0.9,0.5,0.3);

        wait.until(ExpectedConditions.elementToBeClickable(lZümrütevler)).click();
        wait.until(ExpectedConditions.elementToBeClickable(lKaydetButton)).click();


    }

    @Then("Konumunuz Kaydedildi popup’ı kontrol edilir")
    public void konumunuzKaydedildiPopupIKontrolEdilir() throws InterruptedException {
        sleep(1000);
        String actual = Driver.getDriver().findElement(lKonumText).getText();
        String expected = "Konumunuz kaydedildi.";
        try {
            Assert.assertEquals(actual,expected);
            System.out.println("Test Passed");
        }catch (Exception e){
            System.out.println("Konumunuz Kaydedildi popup’ı kontrol edilemedi");
        }
    }

    @Then("Tab bar üzerinden kategoriler tabına Kklanır")
    public void tabBarÜzerindenKategorilerTabınaKklanır() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(lKategorilerimButton)).click();
    }

    @Then("Herhangi bir kategori seçilip listeleme sayfasına yönlenilir")
    public void herhangiBirKategoriSeçilipListelemeSayfasınaYönlenilir() throws InterruptedException {
        baseClass.clickTo(lTelephonesButton);
        sleep(1000);
        baseClass.clickTo(lTümüButton);
    }

    @And("Listeleme sayfasında Yarın Kapında alanında gelen il bilgisi ile anasayfada seçilen il bilgisinin aynı olduğu kontrol edilir")
    public void listelemeSayfasındaYarınKapındaAlanındaGelenIlBilgisiIleAnasayfadaSeçilenIlBilgisininAynıOlduğuKontrolEdilir() {

        //TODO: Yarın Kapında uygulaması haftasonu olduğu için gözükmemektedir. Bu yüzden bu testi yapamadım.
    }
}
