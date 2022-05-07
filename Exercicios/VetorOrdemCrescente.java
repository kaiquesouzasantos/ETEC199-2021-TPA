import java.util.*;

public class VetorOrdemCrescente {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        double[] ordemCrescente = new double[10];
           
        for (int i = 0; i < ordemCrescente.length; i++){
            System.out.print("Digite um numero: "); 
	        ordemCrescente[i] = (in.nextDouble());
	}
           
        Arrays.sort(ordemCrescente);
           
        System.out.print("Ordem crescente:    "); 
       	for (int j = 0; j < ordemCrescente.length; j++) {
       		System.out.print(ordemCrescente[j]+ " | ");       		
	}
    }
}
