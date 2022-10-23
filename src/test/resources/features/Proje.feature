Feature: Wodafone

  @Wodafone
  Scenario: Tc01

    Given Kullanıcı automationpractice anasayfasına gider
    And Kullanıcı signIn butonuna tıklar.
    And Kullanıcı "email" adresini girer
    And Kullanıcı create an account butonuna tıklar
    And Kullanıcı YOUR PERSONAL INFORMATION kısmındaki zorunlu alanları doldurur.
    And Kullanıcı YOUR ADDRESS kısmındaki zorunlu alanları doldurur.
    And Kullanıcı Anasayfada olduğu doğrulanır.
    And Kullanıcı Elbise->Yazlık Elbiseler menüsü seçilir
    And açılan kategoride sayfadan Sepete ürün eklenir.
    And Kullanıcı başka bir Yazlık ürün sepete ekler
    And Kullanıcı eklenen ürünleri doğrular
    And Kullanıcı Proceed to checkout butonuna tıklar
    And Kullanıcı sepetteki Proceed to checkout butonuna tıklar
    And Kullanıcı adresteki Proceed to checkout butonuna tıklar
    And Kullanıcı kargo onay kutucuguna ve Proceed to checkout butonuna tıklar
    And Kullanıcı ödeme yöntemi seçer
    And Kullanıcı ı confirm my order butonuna tıklar
    And Kullanıcı kendi hesabına gider
    And Kullanıcı order history and details butonuna tıklar
    And Kullanıcı siparişlerinin doğruluğunu onaylar
    Then Kullanıcı sayfayı kapatır











