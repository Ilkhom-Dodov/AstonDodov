public class Lesson_6 {

    public static void main(String[] args) {
        String[][] array = {
                {"123", "456", "789", "123"},
                {"456", "текст", "123", "456"},
                {"789", "123", "456", "789"},
                {"123", "456", "123", "123"}
        };
        handlingExceptions(array);

        makeArrayGoOutOfBounds(5);
    }

    public static void handlingExceptions(String[][] array) {
        int firstIndex = 0;
        int secondIndex = 0;
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4х4");
        }
        try {
            for (int i = 0; i < array.length; i++, firstIndex = i) {
                for (int j = 0; j < array[i].length; j++, secondIndex = j) {
                    Integer.parseInt(array[i][j]);
                }
            }
        } catch (IllegalArgumentException s) {
            throw new MyArrayDataException("В ячейке array[" + firstIndex + "][" + secondIndex + "] лежат неверные данные");
        } finally {
            makeArrayGoOutOfBounds(5);
        }
    }

    public static void makeArrayGoOutOfBounds(int arrayLength) throws ArrayIndexOutOfBoundsException {
        int[] array = new int[]{arrayLength};
        try {
            array[arrayLength + 1] = 0;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}