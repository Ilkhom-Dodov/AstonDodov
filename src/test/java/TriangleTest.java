import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {

    @Test(testName = "Расчет площади треугольника по двум сторонам и углу между ними")
    void calculateAreaUsingTwoSidesAndAngleBetween() {
        double firstSide = 6.0; double secondSide = 5.0; int angle = 60;
        double expectedResult = 12.990381056766578;

        Triangle triangle = new Triangle(firstSide, secondSide, angle);

        Assert.assertEquals(triangle.calculateArea(), expectedResult);
    }

    @Test(testName = "Расчет площади треугольника по трем сторонам")
    void calculateAreaUsingThreeSides() {
        double firstSide = 4.0; double secondSide = 3.0; double thirdSide = 6.0;
        double expectedResult = 5.332682251925386;

        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);

        Assert.assertEquals(triangle.calculateArea(), expectedResult);
    }
}
