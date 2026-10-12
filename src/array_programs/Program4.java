package array_programs;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int N = sc.nextInt();

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter number to search in array: ");
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
        sc.close();
    }
}
