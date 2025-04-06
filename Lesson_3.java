public class Lesson_3 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkRange(-10, 20);
        checkIfPositive(0);
        checkIfNegative(1);
        multiplePrint("Строка", 4);
        checkYear(700);
        switchOnesAndZeros();
        fillArrayWithNumbers();
        multiplyByTwo();
        diagonalOnes();
        returnArray(5, 5);
    }

    private static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    private static void checkSumSign() {
        int a = -5;
        int b = 5;
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
        a = 20;
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
        } else {
            return false;
        }
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
        if (year % 4 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0) {
            return false;
        } else {
            return true;
        }
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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    private static void multiplyByTwo () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    private static void diagonalOnes () {
        int index = 3;
        int[][] matrix = new int[index][index];
        for (int one = 0; one < index; one++) {
            for (int two = 0; two < index; two++) {
                if (one == two || one + two == index - 1) {
                    matrix[one][two] = 1;
                } else {
                    matrix[one][two] = 0;
                }
            }
        }
    }

    private static int[] returnArray (int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}