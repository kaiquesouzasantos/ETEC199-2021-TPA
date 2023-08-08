import java.util.Scanner;

public class AreaPerimetroDoQuadrado {
	public static void main(String[] args) {
		System.out.print("Digite o valor do lado ");
        double lado = new Scanner(System.in).nextDouble();
		
        System.out.println("A área do quadrado é: "+(lado*lado));
		System.out.println("O perimetro do quadrado é: "+(lado*4));
	}
}
