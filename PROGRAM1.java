import java.util.*;

public class PROGRAM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int ans = 0;
        map.put(0L, -1);

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (map.containsKey(sum - k)) {
                ans = Math.max(ans, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(ans);
    }
}
