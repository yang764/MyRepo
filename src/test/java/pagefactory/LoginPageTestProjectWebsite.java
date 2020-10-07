package pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTestProjectWebsite {

    WebDriver driver;

    @FindBy(how = How.ID, using = "name")
    WebElement txt_username;

    @FindBy(how = How.ID, using = "password")
    WebElement txt_password;

    @FindBy(how = How.ID, using = "login")
    WebElement btn_login;

    public LoginPageTestProjectWebsite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void validOrInvalidTest(String username, String password) {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        btn_login.sendKeys(Keys.ENTER);
    }

}
