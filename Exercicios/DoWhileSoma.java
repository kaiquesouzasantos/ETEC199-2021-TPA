import java.util.Scanner;

public class DoWhileSoma {
    public static void main(String[] args){
        int contador = 1;
        double num,soma=0;

        do{
            System.out.print("Digite o "+contador+"° número");
            num = new Scanner(System.in).nextDouble();
            soma += num;
            contador++;
        }while(contador<=5);
        
        System.out.println("A soma dos valores é "+soma);
    }
}
