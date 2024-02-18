import java.util.Scanner;

public class DoWhileFatorial {
    public static void main(String args[]) {
        int fatorial=1;

        System.out.print("Digite um número inteiro maior que zero: ");
        int num = new Scanner(System.in).nextInt();

        if(num>0){
            do{
                fatorial*=num;
                num--;
            } while(num > 0);
            System.out.println("O fatorial do número é "+fatorial);
        } else{
            System.out.println("Número inválido, fim do programa!");
        }
    }
}
