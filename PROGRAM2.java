import java.util.*;

public class PROGRAM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) dep[i] = sc.nextInt();

        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat = 0, ans = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                plat++;
                ans = Math.max(ans, plat);
                i++;
            } else {
                plat--;
                j++;
            }
        }

        System.out.println(ans);
    }
}
