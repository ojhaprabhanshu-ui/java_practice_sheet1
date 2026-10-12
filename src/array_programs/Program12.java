package array_programs;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int nextPosition = 0;
        for (int i = 0; i < N; i++) {
            if (numbers[i] != 0) {
                numbers[nextPosition] = numbers[i];
                nextPosition++;
            }
        }
        while (nextPosition < N) {
            numbers[nextPosition] = 0;
            nextPosition++;
        }

        for (int i = 0; i < N; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();

        sc.close();
    }
}
