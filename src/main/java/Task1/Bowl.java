package Task1;

public class Bowl {
    private static int value;

    static void addFood(int amount) {
        value += amount;
    }

    static boolean reduceFood (int amount) {
        if (value - amount < 0) {
            System.out.print("В миске недостаточно еды");
            return false;
        } else {
            value -= amount;
            return true;
        }

    }

    public static int getValue() {
        return value;
    }
}
