import java.util.Scanner;

public class JavaIntroducaoRestaurante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("DIGITE O PESO(KG) DO PRATO: ");
        double pesoPrato = in.nextDouble();

        System.out.println("VALOR DO PRATO: R$"+(pesoPrato * 12));
    }
}
