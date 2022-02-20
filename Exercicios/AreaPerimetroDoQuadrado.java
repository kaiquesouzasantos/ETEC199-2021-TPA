import java.util.Scanner;

public class AreaPerimetroDoQuadrado {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double lado,area,perimetro;

		System.out.println("Digite o valor do lado ");
        	lado =in.nextDouble();

        	area=lado*lado;
		perimetro=lado*4;

       		System.out.println("A área do quadrado é: " + area);
		System.out.println("O perimetro do quadrado é: " + perimetro);
	}
}
