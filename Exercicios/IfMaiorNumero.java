import java.util.Scanner;

public class IfMaiorNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O PRIMEIRO NUMERO: ");
        double num1 = in.nextDouble();

        System.out.print("INFORME O SEGUNDO NUMERO: ");
        double num2 = in.nextDouble();

        if(num1 > num2) System.out.println(num1+" É O MAIOR NUMERO!");
        else if(num1 < num2) System.out.println(num2+" É O MAIOR NUMERO!");
        else System.out.println("OS NUMEROS SÃO IGUAIS!");
    }
}
