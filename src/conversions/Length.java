package conversions;

public class Length {
    public static double Meter(String unit, double value){
        if (unit == "Meter"){
            return value;
        }
        else if(unit == "Kilometer"){
            return value*1000;
        }
        else if(unit == "Centimeter"){
            return value/100;
        }
        else if(unit == "Mile"){
            return value*1609;
        }
        else{
            return value/1000;
        }
    }
    public static double Kilometer(String unit, double value){
        if (unit == "Kilometer"){
            return value;
        }
        else if(unit == "Meter"){
            return value/1000;
        }
        else if(unit == "Centimeter"){
            return value/100000;
        }
        else if(unit == "Mile"){
            return value*1.609;
        }
        else{
            return value/1000000;
        }
    }
    public static double Centimeter(String unit, double value){
        if (unit == "Centimeter"){
            return value;
        }
        else if(unit == "Kilometer"){
            return value*100000;
        }
        else if(unit == "Meter"){
            return value*100;
        }
        else if(unit == "Mile"){
            return value*160900;
        }
        else{
            return value/10;
        }
    }
    public static double Mile(String unit, double value){
        if (unit == "Mile"){
            return value;
        }
        else if(unit == "Kilometer"){
            return value/1.609;
        }
        else if(unit == "Centimeter"){
            return value/160900;
        }
        else if(unit == "Meter"){
            return value/1609;
        }
        else{
            return value/1609000;
        }
    }
    public static double Millimeter(String unit, double value){
        if (unit == "Millimeter"){
            return value;
        }
        else if(unit == "Kilometer"){
            return value*1000000;
        }
        else if(unit == "Centimeter"){
            return value*10;
        }
        else if(unit == "Mile"){
            return value*1609000;
        }
        else{
            return value*1000;
        }
    }

}
