package regression;

import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguagePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span[1]/span[2]/span")
    public static WebElement EN;

    public void clickLanguagePage() {
        EN.click();

    }


}
