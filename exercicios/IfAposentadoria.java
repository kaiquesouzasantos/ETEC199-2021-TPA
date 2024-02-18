import java.time.LocalDateTime;
import java.util.Scanner;

public class IfAposentadoria {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite conforme seu sexo (1 para feminino, 2 para masculino): ");
        int selecao = in.nextInt();

        if(selecao==1){
            retornaRestanteAposentadoria(60);
        }else if(selecao==2){
            retornaRestanteAposentadoria(65);
        } else {
            System.out.println("Fim do programa.");
        }
    }

    private static void retornaRestanteAposentadoria(int idadeAposenta) {
        int aAtual = LocalDateTime.now().getYear();

        System.out.print("Digite seu ano de nascimento: ");
        int aNascimento = in.nextInt();

        int resultado = aAtual-aNascimento;
        int resultadoA = idadeAposenta-resultado;

        if(resultado < idadeAposenta){
            System.out.println("Faltam "+resultadoA+" anos para a sua aposentadoria");
        } else{
            System.out.println("Você já esta aposentado");
        }
    }
}
