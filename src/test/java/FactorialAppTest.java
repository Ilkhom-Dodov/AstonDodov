import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialAppTest {

    @Test
    @DisplayName("Правильный расчет факториала числа")
    void calculateFactorial() {
        int number = 8;
        int expectedResult = 40320;
        assertEquals(expectedResult, FactorialApp.getFactorial(number));
    }
}
