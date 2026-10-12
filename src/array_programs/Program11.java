package array_programs;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int uniqueCount = 0;
        for (int i = 0; i < N; i++) {
            boolean duplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[j] == numbers[i]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                numbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();

        sc.close();
    }
}
