
package array_programs;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int N = sc.nextInt();

        int num = sc.nextInt();
        int maximum = num;
        int minimum = num;

        for (int i = 1; i < N; i++) {
            num = sc.nextInt();

            if (num > maximum) {
                maximum = num;
            }

            if (num < minimum) {
                minimum = num;
            }
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        sc.close();
    }
}
