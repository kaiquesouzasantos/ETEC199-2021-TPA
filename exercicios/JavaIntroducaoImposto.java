import java.util.Scanner;

public class JavaIntroducaoImposto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("DIGITE O NOME DO AUTOMOVEL: ");
        String nomeAutomovel = in.next();

        System.out.print("DIGITE O PRECO DE FABRICA: R$");
        double precoFabrica = in.nextDouble();

        System.out.println(
                "AUTOMOVEL: "+nomeAutomovel
                +"\nPRECO DE FABRICA: R$"+precoFabrica
                +"\nIMPOSTO: R$"+(precoFabrica * 0.45)
                +"\nREVENDEDOR: R$"+(precoFabrica * 0.28)
                +"\nPRECO FINAL: R$"+(precoFabrica + (precoFabrica * (0.45+0.28)))
        );
    }
}
