import java.util.Scanner;

public class DoWhileImpares {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int num;

        System.out.println("Digite um número:");
        num = in.nextInt();

        if(num%2==1){
            do{
                num=num-2;
                System.out.println(num);
            }while(num>1);
        } else{
            num=num-1;
            do{
                num=num-2;
                System.out.println(num);
            }while(num>1);
        }

    }
}
