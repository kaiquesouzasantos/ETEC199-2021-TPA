import java.util.Scanner;

public class MediaAritimerica {
    public static void main(String args[]) {
        
        Scanner in= new Scanner (System.in);
        
        // nota (n), media aritimetica (m)
        double m,n1,n2,n3,n4;
        
        System.out.println ("Digite a 1° nota:");
        n1 =in.nextDouble();
        System.out.println ("Digite a 2° nota:");
        n2 =in.nextDouble();
        System.out.println ("Digite a 3° nota:");
        n3 =in.nextDouble();
        System.out.println ("Digite a 4° nota:");
        n4 =in.nextDouble();

        m =(n1 +n2 + n3+ n4)/4;
        
        System.out.println ("A média aritimética é "+ m);
    }
}