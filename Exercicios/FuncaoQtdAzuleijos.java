import java.util.Scanner;

public class FuncaoQtdAzuleijos{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Altura da parede em centimetros: ");
        double AlturaP = in.nextDouble();

        System.out.print("Largura da parede em centimetros: ");
        double LarguraP = in.nextDouble();

        System.out.print("Altura do ajuleijo em centimetros: ");
        double AlturaA = in.nextDouble();

        System.out.print("Largura do ajuleijo em centimetros: ");
        double LarguraA = in.nextDouble();

        qtd(AlturaA,AlturaP,LarguraA,LarguraP);
    }

    public static void qtd(double AlturaA,double AlturaP,double LarguraA, double LarguraP){
        System.out.print("São necessários "+(AlturaP*LarguraP)/(AlturaA*LarguraA)+" azuleijos.");
    }
}
