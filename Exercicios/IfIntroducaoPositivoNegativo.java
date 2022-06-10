import java.util.Scanner;

public class IfIntroducaoPositivoNegativo {
    public static void main(String args[]) {
        Scanner in= new Scanner (System.in);

        System.out.println ("Digite um número:");
        int n =in.nextInt();

        if (n<0) {
            System.out.println (n+" é classificado como inteiro negativo");
        } else {
            System.out.println (n+" é classificado como inteiro positivo");
        }
    }
}
