import java.util.Scanner;

public class SwitchAposentadoria {
    public static void main(String[] args) {
    
        Scanner in=new Scanner(System.in);

        int selecao,aAtual,aNascimento,resultado,resultadoA;

        System.out.println("Digite conforme seu sexo (1 para feminino, 2 para masculino): ");
        selecao=in.nextInt();

        switch (selecao) {
            case 1 :
                System.out.println("Digite o ano atual: ");
                aAtual=in.nextInt();
                System.out.println("Digite seu ano de nascimento: ");
                aNascimento=in.nextInt();
                resultado=aAtual-aNascimento;
                resultadoA=60-resultado;
                if(resultado<60){
                    System.out.println("Faltam "+resultadoA+" anos para a sua aposentadoria");
                } else{
                    System.out.println("Você já esta aposentado");
                }
                break;
            case 2:
                System.out.println("Digite o ano atual: ");
                aAtual=in.nextInt();
                System.out.println("Digite seu ano de nascimento: ");
                aNascimento=in.nextInt();
                resultado=aAtual-aNascimento;
                resultadoA=65-resultado;
                if(resultado<65){
                    System.out.println("Faltam "+resultadoA+" anos para a sua aposentadoria");
                } else{
                    System.out.println("Você já esta aposentado");
                }
                break;
            default:
                System.out.println("Fim do programa.");
            break;
        }
    }
}