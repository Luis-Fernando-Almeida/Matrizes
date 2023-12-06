package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas e colunas:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] mat = new int[n][m];

        System.out.println("Digite os valores da matriz");

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                mat [i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite um dos valores da matriz para saber sua posição:");
        int x = sc.nextInt();

        System.out.println();
        // Loop que itera sobre as linhas da matriz.
        for (int i = 0; i < mat.length; i++) {
            // Loop interno que itera sobre as colunas da matriz.
            for (int j = 0; j < mat[i].length; j++) {
                // Verifica se o valor na posição atual da matriz é igual ao valor digitado pelo usuário.
                if (mat[i][j] == x) {
                    // Se encontrado, imprime a posição na matriz.
                    System.out.println("Position " + i + "," + j + ":");
                    // Verifica se há um elemento à esquerda na matriz e imprime seu valor.
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    // Verifica se há um elemento acima na matriz e imprime seu valor.
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    // Verifica se há um elemento à direita na matriz e imprime seu valor.
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    // Verifica se há um elemento abaixo na matriz e imprime seu valor.
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
