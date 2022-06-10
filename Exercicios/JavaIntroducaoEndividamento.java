import java.util.Scanner;

public class JavaIntroducaoEndividamento {
    public static void main(String args[]) {
        Scanner in= new Scanner (System.in);
        
        System.out.print("Digite o seu salario:");
        double salario =in.nextDouble();
        
        System.out.println ("O permitido para endividamento é de R$"+(salario * 0.3));
    }
}
