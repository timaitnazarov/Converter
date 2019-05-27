package conversions;

public class Volume {
    public static double Liter(String unit, double value){
        if(unit == "Liter"){
            return value;
        }
        else {
            return value*1000;
        }
    }
    public static double CubicMeter(String unit, double value){
        if(unit == "Liter"){
            return value/1000;
        }
        else {
            return value;
        }
    }

}
