import java.util.Scanner;

public class AreaPerimetroDoQuadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o valor do lado ");
        	double lado =in.nextDouble();
		
       		System.out.println("A área do quadrado é: "+(lado*lado));
		System.out.println("O perimetro do quadrado é: "+(lado*4));
	}
}
