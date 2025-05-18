import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumTests {

    private WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebDriverWait cookieWait = new WebDriverWait(driver, 10);
        try {
            WebElement cookiePopup = cookieWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cookie-agree\"]")));
            cookiePopup.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
        } catch (TimeoutException e) {

        }
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Checking block name")
    void checkIfBlockNameIsRight() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        String actualText = element.getText().trim();
        String expectedText = "Онлайн пополнение\nбез комиссии";

        if (!actualText.equals(expectedText)) {
            throw new AssertionError("Проверяемый вариант не совпадает с названием блока");
        }
    }

    @Test
    @DisplayName("Checking if payment system logos are visible")
    void checkPaymentSystemLogosVisibility() {
        WebElement paymentSystemBlock = driver.findElement(By.cssSelector("div.pay__partners"));
        List<WebElement> logos = paymentSystemBlock.findElements(By.tagName("img"));
        for (WebElement logo : logos) {
            if (!logo.isDisplayed()) {
                throw new AssertionError("Не все логотипы платежных систем видны");
            }
        }
    }

    @Test
    @DisplayName("Correct redirrection to help page")
    void checkIfMoreDetailsLinkIsWorking() {
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        if (!actualResult.equals(expectedResult)) {
            throw new AssertionError("Кнопка \"Подробнее о сервисе\" работает некорректно");
        }
    }

    @Test
    @DisplayName("Correct operation of \"Continue\" button")
    void checkIfContinueNuttonIsWorking() {
        driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys("297777777");
        driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"connection-email\"]")).sendKeys("ilkhom.dodov@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.bepaid-app")));
            if (!popup.isDisplayed()) {
                throw new AssertionError("Поп-ап для ввода данных банковской карты не появился после отправки формы");
            }
        } catch (TimeoutException e) {
            throw new RuntimeException("Timeout: Поп-ап не появился в течение 10 секунд");
        }
    }
}
