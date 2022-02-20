package com.company;
import java.util.Scanner;

public class MatrizIntroducao{
    public static void main(String[] args) {
        double matriz[][] = new double[3][3];

        Scanner in = new Scanner(System.in);
        System.out.println("Matriz M[3][3]");

        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.print("Insira um número: ");
                matriz[linha][coluna]=in.nextDouble();
            }
        }

        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.print(matriz[linha][coluna]+"   ");
            } System.out.println(" ");
        }
    }
}

