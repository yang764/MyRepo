package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePageTestProjectWebsite;
import pagefactory.LoginPageTestProjectWebsite;

import java.util.concurrent.TimeUnit;

public class TestProjectLoginSteps {

    WebDriver driver;
    LoginPageTestProjectWebsite loginPageTestProjectWebsite;
    HomePageTestProjectWebsite homePageTestProjectWebsite;

    @Given("browser opens")
    public void browser_opens() {
        System.out.println("Inside Step - browser opens");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path:" + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on test project page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step - user is on test project page");

        driver.navigate().to("https://example.testproject.io/web/");

    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_a_text_in_search_box(String username, String password) throws InterruptedException {
        System.out.println("Inside Step - user enters username and password");

        LoginPageTestProjectWebsite loginPageTestProjectWebsite = new LoginPageTestProjectWebsite(driver);
        loginPageTestProjectWebsite.validOrInvalidTest(username, password);

    }

    @And("hits login")
    public void hits_enter() throws InterruptedException {
        System.out.println("Inside Step - hits login");



    }

    @Then("user is navigated to the registry page")
    public void user_is_navigated_to_the_registry_page() {
        System.out.println("Inside Step - user is navigated to the registry page");

        homePageTestProjectWebsite = new HomePageTestProjectWebsite(driver);

        System.out.println("结果：" + homePageTestProjectWebsite.logoutButtonIsDisplayed());

//        driver.close();
//        driver.quit();
    }

}
