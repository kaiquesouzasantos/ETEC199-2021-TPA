import java.util.Scanner;

public class ForSomaMultiplicacao {
    public static void main(String args[]) {
        int mult=0;

        for(int cont=1;cont<=5;cont++){
            System.out.println("Digite um número:");
            int num = new Scanner(System.in).nextInt();
            num *=3;
            mult += num;
        } System.out.println("A soma do produto dos múmeros é igual a "+mult);
    }
}
