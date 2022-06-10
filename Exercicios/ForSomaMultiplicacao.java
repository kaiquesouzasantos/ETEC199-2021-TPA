import java.util.Scanner;

public class ForSomaMultiplicacao {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);

        int num, mult=0;

        for(int cont=1;cont<=5;cont++){
            System.out.println("Digite um número:");
            num = in.nextInt();
            num *=3;
            mult += num;
        } System.out.println("A soma do produto dos múmeros é igual a "+mult);
    }
}
