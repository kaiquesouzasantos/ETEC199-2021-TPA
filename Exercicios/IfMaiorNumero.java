import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class IfMaiorNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O PRIMEIRO NUMERO: ");
        double num1 = in.nextDouble();

        System.out.print("INFORME O SEGUNDO NUMERO: ");
        double num2 = in.nextDouble();

        if(num1 == num2)
            System.out.println("OS NUMEROS SÃO IGUAIS!");
        else
            System.out.println(Stream.of(num1, num2).max(Double::compareTo).get()+" É O MAIOR NUMERO!");
    }
}
