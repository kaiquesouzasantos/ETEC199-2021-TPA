import java.util.Scanner;

public class IfPoligono {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME OS LADOS DO SEU POLIGONO: ");
        double lados = in.nextInt();

        System.out.print("INFORME A MEDIDA EM CM: ");
        double medida = in.nextDouble();

        if(lados >= 3 && lados <= 5)
            System.out.println("PERIMETRO: "+(lados * medida));
        else
            System.out.println("POLIGONO NÃO IDENTIFICADO!");
    }
}
