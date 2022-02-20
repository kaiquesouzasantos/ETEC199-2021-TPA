package com.company;
import java.util.Scanner;

public class MatrizSoma{
    public static void main(String[] args) {
        double matriz[][] = new double[50][50];
        double soma = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Matriz M[50][50]\n");

        for(int linha=0 ; linha < 50 ; linha++){
            for(int coluna = 0; coluna < 50 ; coluna ++){
                System.out.print("Insira um número: ");
                soma += (matriz[linha][coluna]=in.nextDouble());
            }
        } System.out.print("A soma do números inseridos á matriz é igual á "+soma);
    }
}
