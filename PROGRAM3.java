import java.util.*;

public class PROGRAM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long maxVal = a[0];
        long minVal = a[0];
        long ans = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < 0) {
                long temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }
            maxVal = Math.max(a[i], maxVal * a[i]);
            minVal = Math.min(a[i], minVal * a[i]);
            ans = Math.max(ans, maxVal);
        }

        System.out.println(ans);
    }
}
