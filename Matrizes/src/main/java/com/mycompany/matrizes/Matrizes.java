package com.mycompany.matrizes;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        // Criação de um scanner para ler os dados
        Scanner scanner = new Scanner(System.in);

        // Definindo as dimensões das matrizes
        int linhas = 5;
        int colunas = 5;

        // Matrizes A, B e C
        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        int[][] matrizC = new int[linhas][colunas];

        // Preenchendo a matriz A
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Preenchendo a matriz B
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }
        
        // Exibindo a matriz C
        System.out.println("A matriz C, que é a soma de A e B, é:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Subtração das matrizes A e B, e armazenando na matriz C
        System.out.println("Matriz C (Subtração: A - B):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }

        // Multiplicação das matrizes A e B, e armazenando na matriz C
        System.out.println("Matriz C (Multiplicação: A * B):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizC[i][j] = 0;
                for (int k = 0; k < colunas; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }

        // Divisão das matrizes A e B, e armazenando na matriz C (elemento a elemento)
        System.out.println("Matriz C (Divisão: A / B):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matrizB[i][j] != 0) {
                    matrizC[i][j] = matrizA[i][j] / matrizB[i][j];
                } else {
                    matrizC[i][j] = 0;  // Evita divisão por zero
                }
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close(); // Fecha o scanner(boa prática)
    }
}
