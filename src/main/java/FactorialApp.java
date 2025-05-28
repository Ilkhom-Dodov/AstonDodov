public class FactorialApp {

    public static int getFactorial (int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }
}
