import java.util.Scanner;

public class FuncaoQtdAzuleijos{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Altura da parede em centimetros: ");
        double alturaP = in.nextDouble();

        System.out.print("Largura da parede em centimetros: ");
        double larguraP = in.nextDouble();

        System.out.print("Altura do ajuleijo em centimetros: ");
        double alturaA = in.nextDouble();

        System.out.print("Largura do ajuleijo em centimetros: ");
        double larguraA = in.nextDouble();

        qtd(alturaA,alturaP,larguraA,larguraP);
    }

    public static void qtd(double alturaA,double alturaP,double larguraA, double larguraP){
        System.out.print("São necessários "+(alturaP*larguraP)/(alturaA*larguraA)+" azuleijos.");
    }
}
