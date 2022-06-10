import java.util.Scanner;

public class IfSalarioMinimo{
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Digite seu salário:");
        double salario=in.nextDouble();

        if (salario>954) {
            System.out.println ("Seu salário se enquadra na classificação superior a um salário mínimo");
        } else {
            System.out.println ("Seu salário se enquadra na classificação inferior a um salário mínimo");
        }
    }
}
