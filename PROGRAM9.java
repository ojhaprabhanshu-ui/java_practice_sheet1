import java.util.*;

public class PROGRAM9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        long ans = Long.MIN_VALUE;

        for (int left = 0; left < c; left++) {
            long[] rowSum = new long[r];
            for (int right = left; right < c; right++) {
                for (int i = 0; i < r; i++) {
                    rowSum[i] += a[i][right];
                }

                long cur = 0;
                long maxKadane = Long.MIN_VALUE;
                for (int i = 0; i < r; i++) {
                    cur += rowSum[i];
                    if (cur > maxKadane) maxKadane = cur;
                    if (cur < 0) cur = 0;
                }
                ans = Math.max(ans, maxKadane);
            }
        }

        System.out.println(ans);
    }
}
