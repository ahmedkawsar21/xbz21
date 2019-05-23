package regression;

import base.base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    public static WebElement account;
    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    public static WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    public  static WebElement emailOrNumber;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    public static WebElement signInPassword;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    public static WebElement signInfromSignInButton;
    @FindBy(xpath = "//*[@id=\"nav-orders\"]/span[2]")
    public static WebElement orders;
    @FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]")
    public static WebElement tryPrime;
    @FindBy(xpath = "//*[@id=\"nav-cart\"]/span[3]")
    public static WebElement Cart;


    public void clickAccount() {
        account.click();
    }

    public void SignIn(String s, String s1) {

    }

    public void CreateYourAmazonAccount() {
        clickAccount();

    }

    public void clickOrders() {
    }

    public void clickTryPrime() {
    }

    public void clickCart() {
    }

    public void searchBox() {

    }

    public void ClickShopDealsOfTheDay() {

    }
    //signin method

    public void signIn(String email, String password) {
        emailOrNumber.sendKeys(email);
        signInPassword.sendKeys(password);
        signInfromSignInButton.click();

    }
    public WebElement getEmailOrNumber(){
        return emailOrNumber;
    }
    public WebElement getSignInPasswordT(){

        return signInPassword;
    }
    public void signInButton() {
        signInfromSignInButton.click();

    }
}

