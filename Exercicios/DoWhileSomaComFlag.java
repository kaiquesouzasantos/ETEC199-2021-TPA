import java.util.Scanner;

public class DoWhileSomaComFlag {
    public static void main(String args[]) {
        Scanner in= new Scanner (System.in);

        int num, soma=0;
        String sequencia;

        do{
            System.out.print("Digite um número inteiro: ");
            num = in.nextInt();

            System.out.print("Quer continuar? [S/N]");
            sequencia = in.next().toUpperCase();
            soma+=num;
        }while(sequencia.equals("S"));

        System.out.println("A soma dos valores é "+soma);
    }
}
