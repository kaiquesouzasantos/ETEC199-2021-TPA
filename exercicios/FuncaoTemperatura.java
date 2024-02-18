public class FuncaoTemperatura{
    public static void calcularF(double Celsius){
        double F = Celsius*1.8+32;
        System.out.println(F);
    }
    public static void calcularK(double Celsius){
        double K = Celsius+273.15;
        System.out.println(K);
    }

    public static void calcularRe(double Celsius){
        double re = Celsius*0.8;
        System.out.println(re);
    }

    public static void calcularRa(double Celsius){
        double ra = Celsius*1.8+32+459.67;
        System.out.println(ra);
    }

    public static void main(String[]args){
        double Celsius = 10.0;
        calcularF(Celsius);
        calcularK(Celsius);
        calcularRa(Celsius);
        calcularRe(Celsius);
    }
}
