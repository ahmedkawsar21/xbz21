package regression;


import base.base.CommonAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CareersPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")
    public static WebElement careers;

    @FindBy(css = "/html/body/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[2]/a")
    public static WebElement teams;


    public void clickCareers() {
        careers.click();

    }

    public void clickTeamsNavButton() {
        teams.click();

    }


}