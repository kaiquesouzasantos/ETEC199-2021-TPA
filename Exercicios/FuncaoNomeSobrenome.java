import java.util.Scanner;

public class FuncaoNomeSobrenome{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Nome: ");
        String Nome = in.next();

        System.out.print("Sobrenome: ");
        String Sobrenome = in.next();

        ImprimirNome(Nome,Sobrenome);
    }

    public static void ImprimirNome(String Nome,String Sobrenome){
        System.out.println(Nome+" "+Sobrenome);
    }
}
