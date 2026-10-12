package array_programs;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF FIRST ARRAY: ");
        int N = sc.nextInt();
        int[] first = new int[N];
        for (int i = 0; i < N; i++) {
            first[i] = sc.nextInt();
        }

        System.out.print("ENTER SIZE OF SECOND ARRAY: ");
        int M = sc.nextInt();
        int[] second = new int[M];
        for (int i = 0; i < M; i++) {
            second[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        boolean needsSpace = false;
        while (i < N && j < M) {
            if (needsSpace) {
                System.out.print(" ");
            }
            if (first[i] <= second[j]) {
                System.out.print(first[i]);
                i++;
            } else {
                System.out.print(second[j]);
                j++;
            }
            needsSpace = true;
        }

        while (i < N) {
            if (needsSpace) {
                System.out.print(" ");
            }
            System.out.print(first[i]);
            i++;
            needsSpace = true;
        }
        while (j < M) {
            if (needsSpace) {
                System.out.print(" ");
            }
            System.out.print(second[j]);
            j++;
            needsSpace = true;
        }
        System.out.println();

        sc.close();
    }
}
