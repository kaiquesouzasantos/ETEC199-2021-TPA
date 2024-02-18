import java.util.Scanner;

public class FuncaoNomeSobrenome{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = in.next();

        System.out.print("Sobrenome: ");
        String sobrenome = in.next();

        imprimirNome(nome, sobrenome);
    }

    public static void imprimirNome(String nome,String sobrenome){
        System.out.println(nome+" "+sobrenome);
    }
}
