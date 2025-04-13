package Task2;

public class Triangle implements GeometryActions {
    private String fillColor = "Yellow";
    private String borderColor = "Red";
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle (double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double calculatePerimeter () {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double calculateArea () {
        if (sideOne == sideTwo && sideTwo == sideThree) {
            return (Math.sqrt(3) / 4) * Math.sqrt(sideOne);
        } else if (sideOne != sideTwo && sideTwo != sideThree) {
            double s = (sideOne + sideTwo + sideThree) / 2;
            return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
        } else {
            double hypotenuse = Math.max(sideOne, Math.max(sideTwo, sideThree));
            double cathetus1, cathetus2;
            if (hypotenuse == sideOne) {
                cathetus1 = sideTwo;
                cathetus2 = sideThree;
            } else if (hypotenuse == sideTwo) {
                cathetus1 = sideOne;
                cathetus2 = sideThree;
            } else {
                cathetus1 = sideOne;
                cathetus2 = sideTwo;
            }
            return 0.5 * cathetus1 * cathetus2;
        }
    }

    public void printShapeInfo() {
        System.out.println("Информация о треугольнике: " +
                "цвет заливки - " + fillColor +
                ", цвет границ - " + borderColor +
                ", периметр - " + calculatePerimeter() +
                ", площадь - " + calculateArea());
    }
}
