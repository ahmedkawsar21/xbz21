package regressionSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.LanguagePage;

public class TestLanguagePage extends LanguagePage {
    LanguagePage languagePage;

    @BeforeMethod
    public void init() {
        languagePage = PageFactory.initElements(driver, LanguagePage.class);
    }
    @Test
    public void clickLanguagePage() {
        languagePage.clickLanguagePage();
        sleepFor(1);
        if(driver.findElement(By.xpath("//*[@id=\"lop-heading\"]")).getText().indexOf("Language Settings")!=-1){
        System.out.println("Success. Message was shown up");
        getScreenshot(driver);
    } else {
        System.out.println("Failed");
        getScreenshot(driver);
    }
    quitDriver();

    }
    public void changeLanguageSettings() {
        languagePage.clickLanguagePage();
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/span")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"icp-btn-save\"]/span/input")).click();
        sleepFor(1);
        System.out.println(driver.getPageSource());
        quitDriver();
    }


}
