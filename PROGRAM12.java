import java.util.*;

public class PROGRAM12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        long[] b = new long[m];
        for (int i = 0; i < m; i++) b[i] = sc.nextLong();

        // binary search on smaller array
        if (n > m) {
            long[] tempArr = a; a = b; b = tempArr;
            int tempLen = n; n = m; m = tempLen;
        }

        int low = 0, high = n;
        int half = (n + m + 1) / 2;
        double ans = 0.0;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = half - i;

            long leftA = (i == 0) ? Long.MIN_VALUE : a[i - 1];
            long rightA = (i == n) ? Long.MAX_VALUE : a[i];

            long leftB = (j == 0) ? Long.MIN_VALUE : b[j - 1];
            long rightB = (j == m) ? Long.MAX_VALUE : b[j];

            if (leftA <= rightB && leftB <= rightA) {
                if ((n + m) % 2 == 1) {
                    ans = Math.max(leftA, leftB);
                } else {
                    ans = (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                }
                break;
            } else if (leftA > rightB) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        System.out.printf(Locale.US, "%.1f\n", ans);
    }
}
