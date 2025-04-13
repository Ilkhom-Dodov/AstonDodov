package Task2;

public class Lesson_5 {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Square square = new Square(5.0);

        circle.printShapeInfo();
        triangle.printShapeInfo();
        square.printShapeInfo();
    }
}
