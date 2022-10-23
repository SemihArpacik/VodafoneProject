package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ProjePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReasuablesMethods;

import javax.swing.*;

public class stepDefinitions {


    ProjePages pages = new ProjePages();


    @Given("Kullanıcı automationpractice anasayfasına gider")

    public void kullanıcı_automationpractice_anasayfasına_gider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ProjeUrl"));


    }

    @Given("Kullanıcı signIn butonuna tıklar.")
    public void kullanıcı_sign_ın_butonuna_tıklar() {
        pages.signIn.click();

    }
    @And("Kullanıcı {string} adresini girer")
    public void kullanıcıMailAdresiniGirer(String email) {
        Faker faker = new Faker();
        email = faker.internet().emailAddress();
        pages.emailTextBox.sendKeys(email);
    }

    @Given("Kullanıcı create an account butonuna tıklar")
    public void kullanıcı_create_an_account_butonuna_tıklar() {
        pages.createAnAccountButton.click();

    }

    @Given("Kullanıcı YOUR PERSONAL INFORMATION kısmındaki zorunlu alanları doldurur.")
    public void kullanıcı_your_personal_ınformatıon_kısmındaki_zorunlu_alanları_doldurur() {
        pages.personelInformationTextBox.
                sendKeys(ConfigReader.getProperty("firstname"),
                        Keys.TAB, ConfigReader.getProperty("lastname"),
                        Keys.TAB, Keys.TAB,
                        ConfigReader.getProperty("password"));


    }

    @Given("Kullanıcı YOUR ADDRESS kısmındaki zorunlu alanları doldurur.")
    public void kullanıcı_your_address_kısmındaki_zorunlu_alanları_doldurur() {
        pages.adressInformation.sendKeys(ConfigReader.getProperty("adress"),
                Keys.TAB, Keys.TAB,
                ConfigReader.getProperty("city"));

        Select select = new Select(pages.selectState);

        select.selectByValue("1");

        pages.postCode.sendKeys(ConfigReader.getProperty("zipCode"));

        Select select1 = new Select(pages.selectCountry);

        select1.selectByValue("21");

        pages.mobilePhone.sendKeys(ConfigReader.getProperty("mobilePhone"));

        pages.registerButton.click();

    }

    @Given("Kullanıcı Anasayfada olduğu doğrulanır.")
    public void kullanıcı_anasayfada_olduğu_doğrulanır() {

        Assert.assertTrue(pages.myAccountPage.getText().contains(ConfigReader.getProperty("firstname")));
    }


    @Given("Kullanıcı Elbise->Yazlık Elbiseler menüsü seçilir")
    public void kullanıcı_elbise_yazlık_elbiseler_menüsü_seçilir() {

        pages.dress.click();

        pages.summerdress.click();

    }

    @Given("açılan kategoride sayfadan Sepete ürün eklenir.")
    public void açılan_kategoride_sayfadan_sepete_ürün_eklenir() {


        pages.Printedsummerdress.click();
        pages.addToCard.click();
        pages.continueShopping.click();


    }

    @Given("Kullanıcı başka bir Yazlık ürün sepete ekler")
    public void kullanıcı_başka_bir_yazlık_ürün_sepete_ekler() {

        pages.search.sendKeys("summer", Keys.ENTER);
        pages.summerDress2.click();
        pages.addToCard.click();
        pages.proceedToCheckout.click();
    }


    @Given("Kullanıcı Proceed to checkout butonuna tıklar")
    public void kullanıcı_proceed_to_checkout_butonuna_tıklar() {

        ReasuablesMethods.JSEScrollBy();
        pages.cartPageProceedToCheckout.click();
        ReasuablesMethods.waitFor(2);


    }

    @Given("Kullanıcı eklenen ürünleri doğrular")
    public void kullanıcı_eklenen_ürünleri_doğrular() {
        ReasuablesMethods.JSEScrollBy();
        Assert.assertTrue(pages.ürün1sepetfiyat.isDisplayed());
        Assert.assertTrue(pages.ürün2sepetfiyat.isDisplayed());
    }


    @Given("Kullanıcı sepetteki Proceed to checkout butonuna tıklar")
    public void kullanıcı_sepetteki_proceed_to_checkout_butonuna_tıklar() {
        pages.cartPageProceedToCheckout.click();

    }

    @Given("Kullanıcı adresteki Proceed to checkout butonuna tıklar")
    public void kullanıcı_adresteki_proceed_to_checkout_butonuna_tıklar() {
        pages.cvg.click();
    }

    @Given("Kullanıcı kargo onay kutucuguna ve Proceed to checkout butonuna tıklar")
    public void kullanıcı_kargo_onay_kutucuguna_ve_proceed_to_checkout_butonuna_tıklar() {
        pages.cvgPageProceedToCheckout.click();
    }

    @Given("Kullanıcı ödeme yöntemi seçer")
    public void kullanıcı_ödeme_yöntemi_seçer() {
        pages.bankwire.click();
    }

    @Given("Kullanıcı ı confirm my order butonuna tıklar")
    public void kullanıcı_ı_confirm_my_order_butonuna_tıklar() {
        pages.iconfirmMyOrder.click();
    }

    @Given("Kullanıcı kendi hesabına gider")
    public void kullanıcı_kendi_hesabına_gider() {
        pages.myAccountPage.click();
    }

    @Given("Kullanıcı order history and details butonuna tıklar")
    public void kullanıcı_order_history_and_details_butonuna_tıklar() {
        pages.orderHistoryAndDetails.click();
    }


    @Given("Kullanıcı siparişlerinin doğruluğunu onaylar")
    public void kullanıcı_siparişlerinin_doğruluğunu_onaylar() {

        Assert.assertTrue(pages.sepettekiToplamÜrünTutarı.isDisplayed());

    }


    @Then("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {

        Driver.CloseDriver();
    }
}

