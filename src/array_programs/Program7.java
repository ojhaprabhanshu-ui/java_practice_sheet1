package array_programs;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ROWS AND COLUMNS: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] first = new int[rows][columns];
        int[][] second = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                first[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                second[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(first[i][j] + second[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
