import java.util.Scanner;

public class DoWhileSoma {
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);

        int contador = 1;
        double num,soma=0;

        do{
            System.out.print("Digite o "+contador+"° número");
            num=in.nextDouble();
            soma += num;
            contador++;
        }while(contador<=5);
        
        System.out.println("A soma dos valores é "+soma);
    }
}
