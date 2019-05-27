package conversions;

public class Temperature {
    public static double Celsius(String unit, double value){
        if(unit == "Celsius"){
            return value;
        }
        else if(unit == "Fahrenheit"){
            return (value - 32)/1.8;
        }
        else{
            return value - 273;
        }
    }
    public static double Fahrenheit(String unit, double value){
        if(unit == "Celsius"){
            return value*1.8 + 32;
        }
        else if(unit == "Fahrenheit"){
            return value;
        }
        else{
            return Celsius("Kelvin", value)*1.8 + 32;
        }
    }
    public static double Kelvin(String unit, double value){
        if(unit == "Celsius"){
            return value + 273;
        }
        else if(unit == "Fahrenheit"){
            return Celsius("Fahrenheit", value) + 273;
        }
        else{
            return value;
        }
    }

}
