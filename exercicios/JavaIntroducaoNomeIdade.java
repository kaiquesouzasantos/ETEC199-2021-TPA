import java.util.Scanner;

public class JavaIntroducaoNomeIdade {
    public static void main(String args[]) {
        Scanner in= new Scanner (System.in);

        System.out.println ("Digite o seu nome:");
        String nome =in.next();
        
        System.out.println ("Digite a sua idade:");
        int idade =in.nextInt();
        
        System.out.println ("Caro " + nome +", sua idade é de " + idade +" anos");
    }
}
