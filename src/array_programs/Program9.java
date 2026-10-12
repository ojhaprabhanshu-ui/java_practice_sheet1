package array_programs;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int N = sc.nextInt();

        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Long.MIN_VALUE) {
            System.out.println("Second Largest: -1");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

        sc.close();
    }
}
