import java.util.Scanner;

public class JavaIntroducaoRestaurante {
    public static void main(String[] args) {
        System.out.println("DIGITE O PESO(KG) DO PRATO: ");
        double pesoPrato = new Scanner(System.in).nextDouble();

        System.out.println("VALOR DO PRATO: R$"+(pesoPrato * 12));
    }
}
