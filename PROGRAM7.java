import java.util.*;

public class PROGRAM7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int ans = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int cur = x;
                int count = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }

        System.out.println(ans);
    }
}
