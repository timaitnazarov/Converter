package conversions;

public class Angle {

    public static double Degree(String unit, double value) {
        if (unit == "Degree") {
            return value;
        } else if (unit == "Radian") {
            return (180 * value) / 3.14;
        } else {
            return (180 * value) / 400;
        }
    }

    public static double Radian(String unit, double value) {
        if (unit == "Radian") {
            return value;
        } else if (unit == "Degree") {
            return (3.14 * value) / 180 ;
        } else {
            return (3.14 * value) / 400;
        }
    }

    public static double Grad(String unit, double value) {
        if (unit == "Grad") {
            return value;
        } else if (unit == "Degree") {
            return (400 * value) / 180 ;
        } else {
            return (400 * value) / 3.14;
        }
    }


}