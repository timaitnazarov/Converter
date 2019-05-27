package conversions;

public class Speed {

    public static double KilometerPerHour(String unit, double value){
        if(unit == "Kilometer per Hour"){
            return value;
        }
        else{
            return value*3.6;
        }
    }

    public static double MeterPerSecond(String unit, double value){

        if(unit == "Kilometer per Hour"){
            return value/3.6;
        }
        else{
            return value;
        }
    }

}
