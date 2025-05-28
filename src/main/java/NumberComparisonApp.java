public class NumberComparisonApp {

    private int firstNumber;
    private int secondNumber;

    public NumberComparisonApp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int compareNumbers() {
        if (this.firstNumber > this.secondNumber) {
            return getFirstNumber();
        } else {
            return getSecondNumber();
        }
    }
}
