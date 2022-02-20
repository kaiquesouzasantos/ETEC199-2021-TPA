import java.util.Scanner;

public class VetorCalculoDeMedia {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] num = new double[10];
        double media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota: ");
            media += (num[i] = in.nextDouble());
        }   System.out.println("A média da notas é igual a "+(media/10)+".");
    }
}