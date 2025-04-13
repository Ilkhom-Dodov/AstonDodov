package Task2;

public class Square implements GeometryActions {
    private String fillColor = "Purple";
    private String borderColor = "Pink";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public void printShapeInfo() {
        System.out.println("Информация о квадрате: " +
                "цвет заливки - " + fillColor +
                ", цвет границ - " + borderColor +
                ", периметр - " + calculatePerimeter() +
                ", площадь - " + calculateArea());
    }
}
