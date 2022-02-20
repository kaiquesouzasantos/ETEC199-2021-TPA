import java.util.Scanner;

public class IfIntroducaoParImpar {
    public static void main(String args[]) {

        Scanner in= new Scanner (System.in);

        int n;

        System.out.println ("Digite um número:");
        n =in.nextInt();

        if (n%2==0) {
            System.out.println ("O número digitado é classificado como par");
        } else {
            System.out.println ("O número digitado é classificado como ímpar");
        }
    }
}