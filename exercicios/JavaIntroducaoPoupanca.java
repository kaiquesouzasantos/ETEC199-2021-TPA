import java.util.Scanner;

public class JavaIntroducaoPoupanca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("QUANTIDADE DE PAES VENDIDOS: ");
        int paesVendidos = in.nextInt();

        System.out.print("QUANTIDADE DE BROAS VENDIDOS: ");
        int broasVendidos = in.nextInt();

        double valorArrecadado = (paesVendidos * 0.12) + (broasVendidos * 1.5);

        System.out.println(
                "VALOR ARRECADADO: R$"+valorArrecadado
                +"\nVALOR POUPANCA: R$"+(valorArrecadado * 0.1)
        );
    }
}
