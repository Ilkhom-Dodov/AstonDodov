import org.testng.Assert;
import org.testng.annotations.Test;


public class FactorialAppTest {

    @Test(testName = "Правильный расчет факториала числа")
    void calculateFactorial() {
        int number = 8;
        int expectedResult = 40320;
        Assert.assertEquals(FactorialApp.getFactorial(number), expectedResult);
    }
}
