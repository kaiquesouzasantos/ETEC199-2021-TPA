import java.util.Scanner;

public class WhileSoma {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int contador = 1;
        double num,soma=0;

        while(contador<=5){
            System.out.print("Digite o "+contador+"° número");
            num = in.nextDouble();
            soma += num;
            contador++;
        } System.out.println("A soma dos valores é "+soma);
    }
}
