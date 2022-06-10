import java.util.Scanner;

public class JavaIntroducaoSalario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salarioInicial, salarioAumento, salarioImposto;

        System.out.print("DIGITE O SALARIO INICIAL: R$");
        salarioInicial = in.nextDouble();

        salarioAumento = salarioInicial + (salarioInicial * 0.15);
        salarioImposto = salarioAumento * 0.08;

        System.out.println(
                "VALOR ACRESCIDO: R$"+(salarioInicial * 0.15)
                +"\nVALOR DESCONTADO: R$"+salarioImposto
                +"\nSALARIO FINAL: R$"+(salarioAumento - salarioImposto)
        );
    }
}
