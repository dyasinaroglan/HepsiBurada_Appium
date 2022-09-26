package tests;

import base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.App;
import utils.Devices;
import utils.Driver;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;
import static utils.Locators.*;
import static utils.Utils.openApp;

public class Scenario1 extends BaseClass {

    AppiumDriver<?> driver;
    WebDriverWait wait;

    @Given("uygulama açılır")
    public void uygulamaAçılır() throws MalformedURLException {
        //bu cihazda ve bu uygulamayı aç diyorum
        openApp(Devices.HUAWEI, App.HEPSIBURADA);
        wait = new WebDriverWait(driver,40);
    }

    @When("Anasayfada Konum alanına Kklanır")
    public void anasayfadaKonumAlanınaKklanır() throws InterruptedException {
        clickTo(lKonum);

    }

    @Then("İl, ilçe ve mahalle seçilir ve kaydet butonuna Kklanır")
    public void ilIlçeVeMahalleSeçilirVeKaydetButonunaKklanır() throws InterruptedException {
        clickTo(lIlSelect);
        sleep(2000);

        scrollTo(0.5, 0.9, 0.5, 0.1);
        clickTo(lIstanbul);
        clickTo(lIlceSelect);
        scrollTo(0.5, 0.9, 0.5, 0.1);
        clickTo(lMaltepe);
        clickTo(lMahalleSelect);
        scrollTo(0.5, 0.9, 0.5, 0.3);
        clickTo(lZümrütevler);
        clickTo(lKaydetButton);

    }

    @Then("Konumunuz Kaydedildi popup’ı kontrol edilir")
    public void konumunuzKaydedildiPopupIKontrolEdilir() throws InterruptedException {
        sleep(1000);
        String actual = Driver.getDriver().findElement(lKonumText).getText();
        String expected = "Konumunuz kaydedildi.";
        try {
            Assert.assertEquals(actual, expected);
            System.out.println("Test Passed");
        } catch (Exception e) {
            System.out.println("Konumunuz Kaydedildi popup’ı kontrol edilemedi");
        }
    }

    @Then("Tab bar üzerinden kategoriler tabına Kklanır")
    public void tabBarÜzerindenKategorilerTabınaKklanır() throws InterruptedException {
        clickTo(lKategorilerimButton);

    }

    @Then("Herhangi bir kategori seçilip listeleme sayfasına yönlenilir")
    public void herhangiBirKategoriSeçilipListelemeSayfasınaYönlenilir() throws InterruptedException {
        clickTo(lTelephonesButton);
        sleep(1000);
        clickTo(lTümüButton);
    }

    @And("Listeleme sayfasında Yarın Kapında alanında gelen il bilgisi ile anasayfada seçilen il bilgisinin aynı olduğu kontrol edilir")
    public void listelemeSayfasındaYarınKapındaAlanındaGelenIlBilgisiIleAnasayfadaSeçilenIlBilgisininAynıOlduğuKontrolEdilir() {

        //TODO: Yarın Kapında uygulaması haftasonu olduğu için gözükmemektedir. Bu yüzden bu testi yapamadım.
    }
}
