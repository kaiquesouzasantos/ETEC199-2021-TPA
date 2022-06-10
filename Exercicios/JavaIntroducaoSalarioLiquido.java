import java.util.Scanner;

public class JavaIntroducaoSalarioLiquido {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("DIGITE AS QTD DE HORAS NORMAIS TRABALHADAS: ");
        double horasNormais = in.nextInt() * 10;

        System.out.println("DIGITE AS QTD DE HORAS EXTRAS TRABALHADAS: ");
        double horasExtras = in.nextInt() * 15;

        double salarioBruto = horasNormais + horasExtras;

        System.out.println(
                "SALARIO BRUTO: R$"+salarioBruto
                +"\nSALARIO LIQUIDO: R$"+(salarioBruto - (salarioBruto * 0.1)));
    }
}
