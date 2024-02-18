import java.util.Scanner;

public class DoWhileImpares {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        int num = new Scanner(System.in).nextInt();

        if(num % 2 != 1)
            num -= 1;

        do{
            num=num-2;
            System.out.println(num);
        }while(num>1);
    }
}
