import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparisonAppTest {

    @Test(testName = "Правильный выбор наибольшего числа из двух, если второе число больше")
    void chooseRightNumberIfSecondOneIsLarger() {
        int firstNumber = 5; int secondNumber = 6;

        NumberComparisonApp application = new NumberComparisonApp(firstNumber, secondNumber);

        Assert.assertEquals(application.compareNumbers(), secondNumber);
    }

    @Test(testName = "Правильный выбор наибольшего числа из двух, если первое число больше")
    void chooseRightNumberIfFirstOneIsLarger() {
        int firstNumber = 10; int secondNumber = 6;

        NumberComparisonApp application = new NumberComparisonApp(firstNumber, secondNumber);

        Assert.assertEquals(application.compareNumbers(), firstNumber);
    }
}
