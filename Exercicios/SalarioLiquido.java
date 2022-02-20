import java.util.Scanner;

public class SalarioLiquido{
    public static void main(String args[]) {
        
        Scanner in= new Scanner (System.in);
        
        // hora de aula (h), aulas aplicadas (a),contribuição ao INSS (c), salario liquido (s)
        double h,a,c,s;
        
        System.out.println ("Digite o valor da hora de aula em R$:");
        h =in.nextDouble();
        System.out.println ("Digite o número de aulas aplicadas no mês:");
        a =in.nextDouble();
        System.out.println ("Digite o percentual de contribuição ao INSS:");
        c =in.nextDouble();

        s=(h*a)- ((h*a)*(c/100));
       
        System.out.println ("Seu salário liquido estimado é de R$"+ s);
    }
}

