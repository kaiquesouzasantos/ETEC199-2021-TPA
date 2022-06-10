import java.util.Scanner;

public class DoWhileImpares {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        int num = in.nextInt();

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
