package conversions;



public class Mass {
    public static double Gram(String unit, double value){
        if (unit == "Gram"){
            return value;
        }
        else if(unit == "Kilogram"){
            return value*1000;
        }
        else{
            return value*1000000;
        }
    }
    public static double Kilogram(String unit, double value){
        if (unit == "Kilogram"){
            return value;
        }
        else if(unit == "Gram"){
            return value/1000;
        }
        else{
            return value*1000;
        }
    }
    public static double Ton(String unit, double value){
        if (unit == "Ton"){
            return value;
        }
        else if(unit == "Kilogram"){
            return value/1000;
        }
        else{
            return value/1000000;
        }
    }

}
