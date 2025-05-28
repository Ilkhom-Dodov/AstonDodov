import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsAppTest {

    MathOperationsApp application = new MathOperationsApp(10, 5);

    @Test
    @DisplayName("Проверка правильности сложения")
    void rightAddition() {
        assertEquals(15, application.summary());
    }

    @Test
    @DisplayName("Проверка правильности умножения")
    void rightMultiplication() {
        assertEquals(50, application.multiply());
    }

    @Test
    @DisplayName("Проверка правильности вычитания")
    void rightSubtraction() {
        assertEquals(5, application.subtract());
    }

    @Test
    @DisplayName("Проверка правильности деления")
    void rightDivison() {
        assertEquals(2, application.divide());
    }
}
