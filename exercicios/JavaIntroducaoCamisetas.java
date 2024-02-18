import java.util.Scanner;

public class JavaIntroducaoCamisetas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int camisetasPequenas, camisetasMedias, camisetasGrandes;

        System.out.print("DIGITE A QUANTIDADE DE CAMISETAS PEQUENAS: ");
        camisetasPequenas = in.nextInt() * 10;

        System.out.print("DIGITE A QUANTIDADE DE CAMISETAS MEDIAS: ");
        camisetasMedias = in.nextInt() * 12;

        System.out.print("DIGITE A QUANTIDADE DE CAMISETAS GRANDES: ");
        camisetasGrandes = in.nextInt() * 15;

        System.out.println(
                "VALOR DE CAMISETAS PEQUENAS: R$"+camisetasPequenas
                +"\nVALOR DE CAMISETAS PEQUENAS: R$"+camisetasMedias
                +"\nVALOR DE CAMISETAS PEQUENAS: R$"+camisetasGrandes
                +"\nVALOR TOTAL DE CAMISETAS: R$"+(camisetasPequenas + camisetasMedias + camisetasGrandes)
        );
    }
}
