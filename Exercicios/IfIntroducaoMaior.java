import java.util.Scanner;

public class IfIntroducaoMaior {
    public static void main(String args[]) {
        Scanner in= new Scanner (System.in);

        System.out.println ("Digite um número:");
        int n =in.nextInt();

        if (n>20) {
            System.out.println (n+"é maior que 20");
        }
    }
}
