import java.util.Scanner;

public class IfIndiceDeMassaCorporal {
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);

        System.out.println ("Digite seu peso em Kg(quilos):");
        double peso=in.nextDouble();
        
        System.out.println ("Digite sua altura em M(metro):");
        double altura=in.nextDouble();

        double imc=peso/(altura*altura);

        if(imc<18.5){
            System.out.println("IMC: "+imc+" | Você está com excesso de magreza");
        } else if(imc>=18.5 && imc<=25){
            System.out.println("IMC: "+imc+" | Você está com peso normal");
        } else if(imc>25 && imc<=30){
            System.out.println("IMC: "+imc+" | Você está com excesso de peso");
        } else if(imc>30 && imc<=35){
            System.out.println("IMC: "+imc+" |Você está com obesidade grau 1");
        } else if(imc>35 && imc<=40){
            System.out.println("IMC: "+imc+" | Você está com obesidade grau 2");
        } else{
            System.out.println("IMC: "+imc+" | Você está com obesidade grau 3");
        }System.out.println("Fim do programa.");
    }
}
