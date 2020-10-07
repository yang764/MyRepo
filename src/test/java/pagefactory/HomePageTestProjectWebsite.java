package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageTestProjectWebsite {

    @FindBy(how = How.ID, using = "logout")
    WebElement btn_logout;

    public HomePageTestProjectWebsite(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public boolean logoutButtonIsDisplayed() {
        return btn_logout.isDisplayed();
    }

}
