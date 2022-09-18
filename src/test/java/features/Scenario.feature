Feature: Hepsiburada

  Scenario: Scenario1
    Given uygulama açılır
    When Anasayfada Konum alanına Kklanır
    Then İl, ilçe ve mahalle seçilir ve kaydet butonuna Kklanır
    Then Konumunuz Kaydedildi popup’ı kontrol edilir
    Then Tab bar üzerinden kategoriler tabına Kklanır
    Then Herhangi bir kategori seçilip listeleme sayfasına yönlenilir
    And Listeleme sayfasında Yarın Kapında alanında gelen il bilgisi ile anasayfada seçilen il bilgisinin aynı olduğu kontrol edilir


    Scenario: Scenario2
      Given uygulama açılır
      When Anasayfada süper fiyat,süper teklif'e tıklanır
      Then Süper fiyat,süper teklif sayfasından bir ürüne gidilir
      Then Ürün detayda ürünün görseline tıklanır ve yana doğru scroll edilir
      Then Görsel ekranı kapatılır
      Then Ürün detaydan favori butonuna basılır
      Then Açılan login sayfasından login olunur ve login olunduğu kontrol edilir
      And Beğendiklerim sayfasına gidilip ürünün beğendiklerime eklendi görülür.
