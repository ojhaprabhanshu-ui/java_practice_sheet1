import java.util.*;

public class PROGRAM10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        long inc = a[0];
        long exc = 0;

        for (int i = 1; i < n; i++) {
            long newInc = exc + a[i];
            long newExc = Math.max(inc, exc);
            inc = newInc;
            exc = newExc;
        }

        System.out.println(Math.max(inc, exc));
    }
}
