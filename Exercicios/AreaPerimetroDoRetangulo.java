import java.util.Scanner;

public class AreaPerimetroDoRetangulo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double ladoMaior,ladoMenor,area,perimetro;

		System.out.println("Digite o valor do maior lado");
		ladoMaior =in.nextDouble();

		System.out.println("Digite o valor do menor lado");
       	 	ladoMenor =in.nextDouble();

       		area=ladoMaior*ladoMenor;
		perimetro=ladoMaior+ladoMenor+ladoMaior+ladoMenor;

        	System.out.println("A área do retângulo é: " + area);
		System.out.println("O perimetro do retângulo é: " + perimetro);
	}

}
