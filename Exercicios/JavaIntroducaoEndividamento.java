import java.util.Scanner;

public class JavaIntroducaoEndividamento {
    public static void main(String args[]) {
        
        Scanner in= new Scanner (System.in);
        
        // salario (s), permitido para endividamento (p)
        double s,p;
        
        System.out.println ("Digite o seu salario:");
        s =in.nextDouble();
        
        p =s * 0.3;
        
        System.out.println ("O permitido para endividamento é de R$"+p);
    }
}