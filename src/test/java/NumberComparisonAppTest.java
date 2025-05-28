import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparisonAppTest {

    @Test
    @DisplayName("Правильный выбор наибольшего числа из двух, если второе число больше")
    void chooseRightNumberIfSecondOneIsLarger() {
        int firstNumber = 5; int secondNumber = 6;

        NumberComparisonApp application = new NumberComparisonApp(firstNumber, secondNumber);

        assertEquals(secondNumber, application.compareNumbers());
    }

    @Test
    @DisplayName("Правильный выбор наибольшего числа из двух, если первое число больше")
    void chooseRightNumberIfFirstOneIsLarger() {
        int firstNumber = 10; int secondNumber = 6;

        NumberComparisonApp application = new NumberComparisonApp(firstNumber, secondNumber);

        assertEquals(firstNumber, application.compareNumbers());
    }
}
