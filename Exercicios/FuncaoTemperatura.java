public class FuncaoTemperatura{
    public static void CalcularF(double Celsius){
        double F = Celsius*1.8+32;
        System.out.println(F);
    }
    public static void CalcularK(double Celsius){
        double K = Celsius+273.15;
        System.out.println(K);
    }

    public static void CalcularRe(double Celsius){
        double re = Celsius*0.8;
        System.out.println(re);
    }

    public static void CalcularRa(double Celsius){
        double ra = Celsius*1.8+32+459.67;
        System.out.println(ra);
    }

    public static void main(String[]args){
        double Celsius = 10.0;
        CalcularF(Celsius);
        CalcularK(Celsius);
        CalcularRa(Celsius);
        CalcularRe(Celsius);
    }
}