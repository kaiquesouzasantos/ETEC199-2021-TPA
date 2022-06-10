import java.util.Scanner;

public class AreaPerimetroDoRetangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite o valor do maior lado");
		double ladoMaior =in.nextDouble();

		System.out.print("Digite o valor do menor lado");
       	 	double ladoMenor =in.nextDouble();

        	System.out.println("A área do retângulo é: " +(ladoMaior*ladoMenor));
		System.out.println("O perimetro do retângulo é: " +(ladoMaior+ladoMenor+ladoMaior+ladoMenor));
	}
}
