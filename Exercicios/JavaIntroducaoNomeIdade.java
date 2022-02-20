import java.util.Scanner;

public class JavaIntroducaoNomeIdade {
    public static void main(String args[]) {
        
        Scanner in= new Scanner (System.in);
        
        // nome (n), idade (i) 
        String n;
        int i;
        
        System.out.println ("Digite o seu nome:");
        n =in.next();
        System.out.println ("Digite a sua idade:");
        i =in.nextInt();
        
        System.out.println ("Caro " + n +", sua idade é de " + i +" anos");
    }
}