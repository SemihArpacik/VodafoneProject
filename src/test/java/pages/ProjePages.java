package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProjePages {

    public ProjePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = ".login")
    public WebElement signIn;

    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement emailTextBox;

    @FindBy (xpath ="//i[@class='icon-user left']")
    public WebElement createAnAccountButton;

    @FindBy (xpath ="//input[@id='customer_firstname']")
    public WebElement personelInformationTextBox;

    @FindBy (xpath ="//input[@id='address1']")
    public WebElement adressInformation;

    @FindBy (xpath ="//select[@id='id_state']")
    public WebElement selectState;

    @FindBy (xpath ="//select[@id='id_country']")
    public WebElement selectCountry;

    @FindBy (xpath ="//button[@id='submitAccount']")
    public WebElement registerButton;

    @FindBy (xpath ="//input[@id='postcode']")
    public WebElement postCode;

    @FindBy (xpath ="//input[@id='phone_mobile']")
    public WebElement mobilePhone;

    @FindBy (xpath ="//a[@class='account']")
    public WebElement myAccountPage;


    @FindBy (xpath ="(//a[@class='sf-with-ul'])[4]")
    public WebElement dress;

    @FindBy (xpath ="(//a[text()='Summer Dresses'])[4]")
    public WebElement summerdress;

    @FindBy (xpath ="(//a[@class='product-name'])[2]")
    public WebElement Printedsummerdress;


    @FindBy (xpath ="//button[@name='Submit']")
    public WebElement addToCard;

    @FindBy (xpath ="//*[@class='continue btn btn-default button exclusive-medium']")
    public WebElement continueShopping;

    @FindBy (xpath ="//input[@id='search_query_top']")
    public WebElement search;

    @FindBy (xpath ="(//*[@class='product-container'])[2]")
    public WebElement summerDress2;

    @FindBy (xpath ="//a[@class='btn btn-default button button-medium']")
    public WebElement proceedToCheckout;

    @FindBy (xpath ="//*[text()='Proceed to checkout']")
    public WebElement cartPageProceedToCheckout;

    @FindBy (css = "#cgv")
    public WebElement cvg;

    @FindBy (name = "processCarrier")
    public WebElement cvgPageProceedToCheckout;

    @FindBy (css = ".bankwire")
    public WebElement bankwire;

    @FindBy (xpath ="(//i[@class='icon-chevron-right right'])[3]")
    public WebElement iconfirmMyOrder;

    @FindBy (xpath ="//i[@class='icon-list-ol']")
    public WebElement orderHistoryAndDetails;

    @FindBy (xpath ="//p[@itemprop='offers']")
    public WebElement ürün1Detayfiyat;

    @FindBy (xpath ="(//span[@class='price'])[4]")
    public WebElement ürün1sepetfiyat;

    @FindBy (xpath ="(//span[@class='price'])[7]")
    public WebElement ürün2sepetfiyat;

    @FindBy (xpath ="//span[@itemprop='price']")
    public WebElement ürün2Detayfiyat;

    @FindBy (xpath ="//span[@class='price']")
    public WebElement sepettekiToplamÜrünTutarı;























    //a[@class='btn btn-default button button-medium']

















}