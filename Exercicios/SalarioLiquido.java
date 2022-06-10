import java.util.Scanner;

public class SalarioLiquido{
    public static void main(String args[]) {
        Scanner in= new Scanner (System.in);
        
        System.out.print("Digite o valor da hora de aula: R$");
        double valorHora = in.nextDouble();
        
        System.out.print("Digite o número de aulas aplicadas no mês:");
        int aulas =in.nextDouble();
        
        System.out.print("Digite o percentual de contribuição ao INSS:");
        double imposto = in.nextDouble();

        System.out.println("Seu salário liquido estimado é de R$"+((valorHora * aulas) - ((valorHora * aulas) * (imposto/100))));
    }
}
