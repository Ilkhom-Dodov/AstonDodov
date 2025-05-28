import org.testng.Assert;
import org.testng.annotations.Test;

public class MathOperationsAppTest {

    MathOperationsApp application = new MathOperationsApp(10, 5);

    @Test(testName = "Проверка правильности сложения")
    void rightAddition() {
        Assert.assertEquals(application.summary(), 15);
    }

    @Test(testName = "Проверка правильности умножения")
    void rightMultiplication() {
        Assert.assertEquals(application.multiply(), 50);
    }

    @Test(testName = "Проверка правильности вычитания")
    void rightSubtraction() {
        Assert.assertEquals(application.subtract(), 5);
    }

    @Test(testName = "Проверка правильности деления")
    void rightDivison() {
        Assert.assertEquals(application.divide(), 2);
    }
}
