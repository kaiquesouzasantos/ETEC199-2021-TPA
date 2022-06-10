import java.util.Scanner;

public class MediaAritimerica {
    public static void main(String args[]) { 
        Scanner in= new Scanner (System.in);
       
        double notas = 0;
        
        System.out.println ("Digite a 1° nota:");
        notas += in.nextDouble();
        
        System.out.println ("Digite a 2° nota:");
        notas += in.nextDouble();
        
        System.out.println ("Digite a 3° nota:");
        notas += in.nextDouble();
        
        System.out.println ("Digite a 4° nota:");
        notas += in.nextDouble();
        
        System.out.println ("A média aritimética é "+(nota/4));
    }
}
