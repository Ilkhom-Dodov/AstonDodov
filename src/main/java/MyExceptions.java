public class MyExceptions {

}
    class MyArraySizeException extends IllegalArgumentException {

        public MyArraySizeException(String s) {
            System.out.println(s);
        }
    }

    class MyArrayDataException extends IllegalArgumentException {

        public MyArrayDataException(String s) {
            System.out.println(s);
        }
    }