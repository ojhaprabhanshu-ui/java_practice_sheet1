package array_programs;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                int frequency = 0;
                for (int j = i; j < N; j++) {
                    if (numbers[j] == numbers[i]) {
                        frequency++;
                    }
                }
                System.out.println("Element: " + numbers[i] + " Frequency: " + frequency);
            }
        }

        sc.close();
    }
}
