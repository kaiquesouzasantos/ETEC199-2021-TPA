import java.util.Scanner;

public class ForMultiplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num,multiplicador=0,total=0;

        System.out.println("Informe um número: ");
        num = in.nextInt();

        for (int cont=0; cont<=10;cont++,total=num*++multiplicador) {
            System.out.println(num+" x "+multiplicador+" = "+total);
        } System.out.println("Fim do programa!");
    }
}
