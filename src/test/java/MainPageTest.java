import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageTest {

    public static MainPage mainPage;
    public static WebDriver driver;

    String expectedEmailPlaceholder = "E-mail для отправки чека";
    String expectedSumPlaceholder = "Сумма";
    String expectedPhoneNumberPlaceholder = "Номер телефона";
    String expectedInternetNumberPlaceholder = "Номер абонента";
    String expectedInstallmentPlaceholder = "Номер счета на 44";
    String expectedDebtPlaceholder = "Номер счета на 2073";

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.get("https://www.mts.by/");
        WebDriverWait cookieWait = new WebDriverWait(driver, 5);
        try {
            WebElement cookiePopup = cookieWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cookie-agree\"]")));
            cookiePopup.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
        } catch (TimeoutException ignored) {

        }
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Checking block name")
    void checkIfBlockNameIsRight() {
        String actualHeader = mainPage.getPayWrapperHeader();
        String expectedHeader = "Онлайн пополнение\nбез комиссии";

        try {
            assertEquals(expectedHeader, actualHeader);
        } catch (AssertionError e) {
            throw new AssertionError("Проверяемый вариант не совпадает с фактическим названием блока");
        }

    }

    @Test
    @DisplayName("Checking if payment system logos are visible")
    void checkPaymentSystemLogosVisibility() {
        List<WebElement> logos = mainPage.getPaymentSystemsLogos();
        for (WebElement logo : logos) {
            if (!logo.isDisplayed()) {
                throw new AssertionError("Не все логотипы платежных систем видны");
            }
        }
    }

    @Test
    @DisplayName("Correct redirrection to help page")
    void checkIfMoreDetailsLinkIsWorking() {
        String actualResult = mainPage.clickOnLinkToHelpPageAndGetUrl();
        String expectedResult = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        if (!actualResult.equals(expectedResult)) {
            throw new AssertionError("Кнопка \"Подробнее о сервисе\" работает некорректно");
        }
    }

    @Test
    @DisplayName("Correct operation of \"Continue\" button")
    void checkIfContinueButtonIsWorking() {
        mainPage.setPhoneNumber("297777777");
        mainPage.setPhoneSum("50");
        mainPage.setPhoneEmail("ilkhom.dodov@gmail.com");
        mainPage.clickContinue();

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

    @Test
    @DisplayName("Correct placholders (telephone)")
    void checkIfTelephonePlaceholdersCorrect() {
        String actualTelephoneNumberPlaceholder = mainPage.getPlaceholder(mainPage.getTelephoneNumberField());
        String actualTelephoneSumPlaceholder = mainPage.getPlaceholder(mainPage.getTelephoneSumField());
        String actualTelephoneEmailPlaceholder = mainPage.getPlaceholder(mainPage.getTelephoneEmailField());

        assertEquals(expectedPhoneNumberPlaceholder, actualTelephoneNumberPlaceholder);
        assertEquals(expectedSumPlaceholder, actualTelephoneSumPlaceholder);
        assertEquals(expectedEmailPlaceholder, actualTelephoneEmailPlaceholder);
    }

    @Test
    @DisplayName("Correct placeholders (internet)")
    void checkIfInternetPlaceholdersCorrect() {
        String actualInternetNumberPlaceholder = mainPage.getPlaceholder(mainPage.getInternetNumberField());
        String actualInternetSumPlaceholder = mainPage.getPlaceholder(mainPage.getInternetSumField());
        String actualInternetEmailPlaceholder = mainPage.getPlaceholder(mainPage.getInternetEmailField());

        assertEquals(expectedInternetNumberPlaceholder, actualInternetNumberPlaceholder);
        assertEquals(expectedSumPlaceholder, actualInternetSumPlaceholder);
        assertEquals(expectedEmailPlaceholder, actualInternetEmailPlaceholder);
    }

    @Test
    @DisplayName("Correct placeholders (installments")
    void checkIfInstallmentsPlaceholdersCorrect() {
        String actualInstallmentNumberPlaceholder = mainPage.getPlaceholder(mainPage.getInstallmentNumberField());
        String actualInstallmentSumPlaceholder = mainPage.getPlaceholder(mainPage.getInstallmentSumField());
        String actualInstallmentEmailPlaceholder = mainPage.getPlaceholder(mainPage.getInstallmentEmailField());

        assertEquals(expectedInstallmentPlaceholder, actualInstallmentNumberPlaceholder);
        assertEquals(expectedSumPlaceholder, actualInstallmentSumPlaceholder);
        assertEquals(expectedEmailPlaceholder, actualInstallmentEmailPlaceholder);
    }

    @Test
    @DisplayName("Correct placeholders (debt)")
    void checkIfDebtPlaceholdersCorrect() {
        String actualDebtNumberPlaceholder = mainPage.getPlaceholder(mainPage.getDebtNumberField());
        String actualDebtSumPlaceholder = mainPage.getPlaceholder(mainPage.getDebtSumField());
        String actualDebtEmailPlaceholder = mainPage.getPlaceholder(mainPage.getDebtEmailField());

        assertEquals(expectedDebtPlaceholder, actualDebtNumberPlaceholder);
        assertEquals(expectedSumPlaceholder, actualDebtSumPlaceholder);
        assertEquals(expectedEmailPlaceholder, actualDebtEmailPlaceholder);
    }

    @Test
    @DisplayName("Correct values after sending form")
    void checkIfValuesAfterSendingFormAreCorrect() {
        mainPage.invokePopUp("297777777","50", "ilkhom.dodov@gmail.com");
        mainPage.switchToIframe();
        String[] actualArray = mainPage.getPlaceholdersFromPopUp();
        String[] expectedArray = {"50.00 BYN",
                "Оплата: Услуги связи Номер:375297777777",
                "Номер карты",
                "Срок действия",
                "CVC",
                "Имя и фамилия на карте",
                "Оплатить 50.00 BYN"};

        assertArrayEquals(expectedArray, actualArray);
        }
}



