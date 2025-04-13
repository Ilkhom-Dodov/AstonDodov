package Task2;

public class Circle implements GeometryActions{
    private String fillColor = "Black";
    private String borderColor = "Green";
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void printShapeInfo() {
        System.out.println("Информация об окружности: " +
                "цвет заливки - " + fillColor +
                ", цвет границ - " + borderColor +
                ", периметр - " + calculatePerimeter() +
                ", площадь - " + calculateArea());
    }
}
