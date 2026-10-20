import java.util.*;

public class PROGRAM11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }

        int l = 0, r = n - 1;
        long leftMax = 0, rightMax = 0;
        long water = 0;

        while (l < r) {
            if (h[l] <= h[r]) {
                if (h[l] >= leftMax) {
                    leftMax = h[l];
                } else {
                    water += leftMax - h[l];
                }
                l++;
            } else {
                if (h[r] >= rightMax) {
                    rightMax = h[r];
                } else {
                    water += rightMax - h[r];
                }
                r--;
            }
        }

        System.out.println(water);
    }
}
