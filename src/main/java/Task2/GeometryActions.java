package Task2;

public interface GeometryActions {
    default double calculatePerimeter() {
        return 0;
    }

    default double calculateArea() {
        return 0;
    }
}
