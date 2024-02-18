import java.util.Scanner;

public class IfMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;

        for(int i = 1; i <= 4; i++){
            System.out.printf("INFORME A NOTA %d: ", i);
            double nota = in.nextDouble();

            if(nota < 0 || nota > 10){
                i -= 1;
                continue;
            }

            soma += nota;
        }

        if((soma/4) > 5) System.out.printf("VOCE PASSOU COM MEDIA %.2f", (soma/4));
        else System.out.println("REPROVADO!");
    }
}
