import java.text.DecimalFormat;

/**
 * Created by nedwaldie on 1/17/17.
 */
public class Circle {
    double radius;

    public static int numberOfCircles;

    public static int getNumberOfCircles(){
        return numberOfCircles;
    };

    public Circle(Double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public double getCircumference() {
        return (2 * radius) * Math.PI;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public String formatNumber(double x) {
        double roundOff = Math.round(x * 100.0) / 100.0;
        return Double.toString(roundOff);
    }
}
