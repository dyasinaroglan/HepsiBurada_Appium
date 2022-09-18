package utils;

import org.openqa.selenium.By;

public interface Locators {

    //Scenario1

    By lKonum = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.pozitron.hepsiburada:id/locationView']");
    By lIlSelect = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.pozitron.hepsiburada:id/citySelectorView']");
    By lIstanbul = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.pozitron.hepsiburada:id/townSelectorView' and @index='5']");
    By lIlceSelect = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.pozitron.hepsiburada:id/townSelectorView']");
    By lMaltepe = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.pozitron.hepsiburada:id/districtSelectorView']");
    By lMahalleSelect = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.pozitron.hepsiburada:id/districtSelectorView']");
    By lZümrütevler = By.xpath("//android.view.ViewGroup[@resource-id='com.pozitron.hepsiburada:id/container' and @index='4']");
    By lKaydetButton = By.xpath("//android.widget.Button[@resource-id='com.pozitron.hepsiburada:id/button']");
    By lKonumText = By.xpath("//android.widget.TextView[@resource-id='com.pozitron.hepsiburada:id/tvTitle']");
    By lKategorilerimButton = By.xpath("//android.widget.FrameLayout[@resource-id='com.pozitron.hepsiburada:id/nav_graph_category']");
    By lTelephonesButton = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.pozitron.hepsiburada:id/cardViewComponent' and @index='1']");
    By lTümüButton = By.xpath("//android.view.ViewGroup[@resource-id='com.pozitron.hepsiburada:id/layoutRoot' and @index='9']");


    //Scenari2

    By lTümüButton1 = By.xpath("//android.widget.TextView[@resource-id='com.pozitron.hepsiburada:id/textView_show_all']");
    By lÜrünSelect = By.xpath("//android.widget.ImageView[@content-desc=\"ürün fotoğrafı\"]");
    By lPicturesClick = By.xpath("//android.widget.ImageView[@resource-id='com.pozitron.hepsiburada:id/productImage']");
    By lGorselClose = By.xpath("//android.widget.Button[@resource-id='com.pozitron.hepsiburada:id/leftIcon']");
    By lFavoriButton = By.xpath("//android.widget.ImageView[@content-desc=\"favoriye ekle\"]");

    By lUsername = By.xpath("//android.widget.EditText[@resource-id='txtUserName']");
    By lGirisYapButton = By.xpath("//android.widget.Button[@resource-id='btnLogin']");

    By lPassword = By.xpath("//android.widget.EditText[@resource-id='txtPassword']");
    By lGirisYapButton2 = By.xpath("//android.widget.Button[@resource-id='btnEmailSelect']");

    By lTextMessage = By.id("android:id/message");

    By lTamamButton = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    By lBackButton = By.xpath("//android.widget.Button[@resource-id='com.pozitron.hepsiburada:id/leftIcon']");
    By lListelerimButton = By.xpath("//android.widget.FrameLayout[@resource-id='com.pozitron.hepsiburada:id/nav_graph_my_list']");
    By lBegendiklerimButton = By.xpath("//android.view.View[@content-desc=\"Beğendiklerim Gizli liste Ürün ekle\"]/android.widget.TextView[1]");
    By lBegendiklerimBox = By.xpath("//android.view.View[@content-desc='123 4.198,99 TL Xiaomi Redmi 9c 128 GB 4 GB Ram (Xiaomi Türkiye Garantili) Mor 4,5 258 Değerlendirme Sepete ekle']");
}
