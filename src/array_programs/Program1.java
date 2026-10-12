package array_programs;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        System.out.print("ENTER SIZE OF ARRAY:");
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int total = 0;
        

        for (int i = 0; i < N; i++) {
            int marks = sc.nextInt();
            total += marks;
        }

        double average = (double) total / N;

        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);

        sc.close();
    }
}
