package array_programs;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF SQUARE MATRIX: ");
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        long mainDiagonalSum = 0;
        long secondaryDiagonalSum = 0;
        for (int i = 0; i < N; i++) {
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][N - 1 - i];
        }

        System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
        System.out.println("Difference: " + Math.abs(mainDiagonalSum - secondaryDiagonalSum));

        sc.close();
    }
}
