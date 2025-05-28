public class Triangle {

    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private Integer angle;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.angle = null;
    }

    public Triangle(double firstSide, double secondSide, int angle) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.angle = angle;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public double calculateArea() {
        if (angle == null) {
            double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
            return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        } else {
            double radians = Math.toRadians(angle);
            return 0.5 *  firstSide * secondSide * Math.sin(radians);
        }
    }
}