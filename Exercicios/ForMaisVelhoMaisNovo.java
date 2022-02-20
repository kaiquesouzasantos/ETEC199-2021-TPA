import java.util.Scanner;

public class ForMaisVelhoMaisNovo{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String user1,user2,userMaior,userMenor,userResultMaior="",userResultMenor="";
        int idade1,idade2,idadeMaior,idadeMenor,idadeResultMaior=0,idadeResultMenor=0;

        for(int cont=1;cont<=5;cont++) {

            System.out.println("Digite o nome do usuário:");
            user1 = in.next();

            System.out.println("Digite a idade do usuário:");
            idade1 = in.nextInt();

            System.out.println("Digite o nome do usuário:");
            user2 = in.next();

            System.out.println("Digite a idade do usuário:");
            idade2 = in.nextInt();

            if (idade1 >= idade2) {
                idadeMaior = idade1;
                userMaior = user1;
                idadeMenor = idade2;
                userMenor = user2;
            } else {
                idadeMaior = idade2;
                userMaior = user2;
                idadeMenor = idade1;
                userMenor = user1;
            }
            if (idadeMaior > idadeResultMaior) {
                idadeResultMaior = idadeMaior;
                userResultMaior = userMaior;
            }
            if(idadeResultMenor==0){
                idadeResultMenor=idadeMenor;
            }
            if (idadeMenor <= idadeResultMenor) {
                idadeResultMenor = idadeMenor;
                userResultMenor = userMenor;
            }
        }
        System.out.println(userResultMaior+" tem a maior idade, pois tem "+idadeResultMaior+" anos.");
        System.out.println(userResultMenor+" tem a menor, pois tem "+idadeResultMenor+" anos.");
        System.out.println("Fim do programa!");
    }
}
