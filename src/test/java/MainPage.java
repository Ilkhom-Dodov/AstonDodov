import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage {

    public WebDriver driver;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")
    private WebElement payWrapperHeader;

    @FindBy(css = "div.pay__partners ul li")
    private List<WebElement> paymentSystemsLogos;

    @FindBy(linkText = "Подробнее о сервисе")
    private WebElement linkToHelpPage;

    @FindBy(css = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button")
    private WebElement selectButton;

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")
    private WebElement mobileService;

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")
    private WebElement internetService;

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p")
    private WebElement installmentService;

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p")
    private WebElement debtService;

    @FindBy(xpath = "//*[@id=\"connection-phone\"]")
    private WebElement telephoneNumberField;

    @FindBy(xpath = "//*[@id=\"connection-sum\"]")
    private WebElement telephoneSumField;

    @FindBy(xpath = "//*[@id=\"connection-email\"]")
    private WebElement telephoneEmailField;

    @FindBy(xpath = "//*[@id=\"internet-phone\"]")
    private WebElement internetNumberField;

    @FindBy(xpath = "//*[@id=\"internet-sum\"]")
    private WebElement internetSumField;

    @FindBy(xpath = "//*[@id=\"internet-email\"]")
    private WebElement internetEmailField;

    @FindBy(xpath = "//*[@id=\"score-instalment\"]")
    private WebElement installmentNumberField;

    @FindBy(xpath = "//*[@id=\"instalment-sum\"]")
    private WebElement installmentSumField;

    @FindBy(xpath = "//*[@id=\"instalment-email\"]")
    private WebElement installmentEmailField;


    @FindBy(xpath = "//*[@id=\"score-arrears\"]")
    private WebElement debtNumberField;


    @FindBy(xpath = "//*[@id=\"arrears-sum\"]")
    private WebElement debtSumField;

    @FindBy(xpath = "//*[@id=\"arrears-email\"]")
    private WebElement debtEmailField;

    @FindBy(xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement continueButton;

    @FindBy(xpath = "/html/body/app-root/div/div")
    private WebElement popUp;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span")
    private WebElement sumInPopUp;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button")
    private WebElement sumInPopUpButton;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span")
    private WebElement numberInPopUp;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label")
    private WebElement cardNumberPlaceholder;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label")
    private WebElement cardPeriodPlaceholder;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label")
    private WebElement cvc;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label")
    private WebElement nameOnCard;

    @FindBy(css = "div.cards-brands cards-brands__container ng-tns-c891095944-0 ng-trigger ng-trigger-brandsState ng-star-inserted img")
    private List<WebElement> paymentSystemsLogosInPopUp;

    public String getPayWrapperHeader() {
        return payWrapperHeader.getText();
    }

    public List<WebElement> getPaymentSystemsLogos() {
        return paymentSystemsLogos;
    }

    public String clickOnLinkToHelpPageAndGetUrl() {
        linkToHelpPage.click();
        return driver.getCurrentUrl();
    }

    public void setPhoneNumber(String number) {
        telephoneNumberField.sendKeys(number);
    }

    public void setPhoneSum(String sum) {
        telephoneSumField.sendKeys(sum);
    }

    public void setPhoneEmail(String email) {
        telephoneEmailField.sendKeys(email);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public WebElement getTelephoneNumberField() {
        return telephoneNumberField;
    }

    public WebElement getTelephoneSumField() {
        return telephoneSumField;
    }

    public WebElement getTelephoneEmailField() {
        return telephoneEmailField;
    }

    public WebElement getInternetNumberField() {
        return internetNumberField;
    }

    public WebElement getInternetSumField() {
        return internetSumField;
    }

    public WebElement getInternetEmailField() {
        return internetEmailField;
    }

    public WebElement getInstallmentNumberField() {
        return installmentNumberField;
    }

    public WebElement getInstallmentSumField() {
        return installmentSumField;
    }

    public WebElement getInstallmentEmailField() {
        return installmentEmailField;
    }

    public WebElement getDebtNumberField() {
        return debtNumberField;
    }

    public WebElement getDebtSumField() {
        return debtSumField;
    }

    public WebElement getDebtEmailField() {
        return debtEmailField;
    }

    public String getPlaceholder (WebElement element) {
        return element.getAttribute("placeholder");
    }

    public void invokePopUp(String number, String sum, String email) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        setPhoneNumber(number);
        setPhoneSum(sum);
        setPhoneEmail(email);
        clickContinue();
    }

    public void switchToIframe() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.bepaid-app > div > iframe")));
        WebElement iframe = driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe"));
        driver.switchTo().frame(iframe);
    }

    public String[] getPlaceholdersFromPopUp() {
        return new String[] {
                driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span")).getText(),
                driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span")).getText(),
                driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label")).getText(),
                driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label")).getText(),
                driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label")).getText(),
                driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label")).getText(),
                driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button")).getText()
        };
    }
}