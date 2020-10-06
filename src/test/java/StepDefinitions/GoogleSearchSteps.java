package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is open");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path:" + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step - user is on google search page");

        driver.navigate().to("http://.baidu.com/");

    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() throws InterruptedException {
        System.out.println("Inside Step - user enters a text in search box");

        driver.findElement(By.id("kw")).sendKeys("张");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("家");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("辉");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("为");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("什");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("么");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("代");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("言");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("游");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("戏");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys(",");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("难");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("道");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("真");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("的");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("缺");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("钱");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("吗");
        Thread.sleep(300);
        driver.findElement(By.name("wd")).sendKeys("？");
        Thread.sleep(2000);

    }

    @And("hits enter")
    public void hits_enter() throws InterruptedException {
        System.out.println("Inside Step - hits enter");

        driver.findElement(By.name("wd")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"3\"]/h3/a/em[2]")).click();
        String firstHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (handle.equals(firstHandle)) continue;
            driver.switchTo().window(handle);
        }
        driver.findElement(By.xpath("//*[@id=\"aside_about\"]/div[2]/p[1]/a")).click();

    }

    @Then("user is navigated to the result page")
    public void user_is_navigated_to_the_result_page() {
        System.out.println("Inside Step - user is navigated to the result page");

        System.out.println("结果：" + driver.getPageSource().contains("影帝"));
//        driver.close();
//        driver.quit();
    }

}
