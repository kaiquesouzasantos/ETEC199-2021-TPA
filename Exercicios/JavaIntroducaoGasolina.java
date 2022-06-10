import java.util.Scanner;

public class JavaIntroducaoGasolina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("DIGITE O PREÇO DA GASOLINA: R$");
        double precoGasolina = in.nextDouble();

        System.out.print("DIGITE A CAPACIDADE DO TANQUE(L): ");
        int tanqueLitros = in.nextInt();

        System.out.println("VALOR PAGO: R$"+(tanqueLitros * precoGasolina));
    }
}
