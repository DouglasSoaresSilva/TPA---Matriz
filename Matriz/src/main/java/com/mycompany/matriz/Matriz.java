package com.mycompany.matriz;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
       //Cria um scanner para ler os dados
        Scanner scanner = new Scanner(System.in);

        // Definindo as dimensões das matrizes
        int linhas = 5;
        int colunas = 5;

        // Matrizes A, B e C
        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        int[][] matrizC = new int[linhas][colunas];

        // Preenchendo a matriz A
        System.out.println("Digite os valores para a matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Preenchendo a matriz B
        System.out.println("Digite os valores para a matriz B:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma das matrizes A e B, e armazenando na matriz C
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibindo a matriz C
        System.out.println("A matriz C é:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
        // Fecha o scanner (boa prática)
        scanner.close();
    }
}