public class Lesson_3 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkRange(-10, 8);
        checkIfPositive(10);
        checkIfNegative(-23);
        multiplePrint("Строка", 3);
        checkYear(200);
        switchOnesAndZeros();
        fillArrayWithNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    private static void checkSumSign() {
        int a = -5;
        int b = 10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");

        }
    }

    private static void compareNumbers() {
        int a, b;
        a = 15;
        b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static boolean checkRange(int a, int b) {
        int sum = a + b;
        if ((sum >= 10) && (sum <= 20)) {
            return true;
        } else return false;
    }

    private static void checkIfPositive(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " - положительное");
        } else {
            System.out.println("Число " + a + " - отрицательное");
        }
    }

    private static boolean checkIfNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void multiplePrint(String s, int a) {
        for (int i = a; i > 0; i--) {
            System.out.println(s);
        }
    }

    private static boolean checkYear (int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0) {
            return false;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        else return false;
    }

    private static void switchOnesAndZeros() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    private static void fillArrayWithNumbers () {
        int [] arr = new int[100];
        int index = 1;
        for (int i : arr) {
            arr[i] = index;
            index++;
        }
    }

    private

}

