import java.util.Scanner;

public class IfSalarioMinimo{
    public static void main(String args[]) {
        System.out.print("Digite seu salário: R$");
        double salario = new Scanner(System.in).nextDouble();

        if (salario>954)
            informaSalario("superior");
        else
            informaSalario("inferior");
    }

    private static void informaSalario(String classificacao) {
        System.out.println ("Seu salário se enquadra na classificação "+classificacao+" a um salário mínimo");
    }
}
